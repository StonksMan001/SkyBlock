package net.me.quark_innermod.config;

/*
 * Copyright (c) 2021 magistermaks
 * Slightly modified
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class SimpleConfigAPI {

    private static final Logger LOGGER = LogManager.getLogger("SimpleConfig");
    private final HashMap<String, String> config = new HashMap<>();
    private final ConfigRequest request;
    private boolean broken = false;

    public interface DefaultConfig {
        String get(String namespace);

        static String empty( String namespace ) {
            return "";
        }
    }

    public static class ConfigRequest {

        private final File file;
        private final String filename;
        private DefaultConfig provider;

        private ConfigRequest(File file, String filename ) {
            this.file = file;
            this.filename = filename;
            this.provider = DefaultConfig::empty;
        }

        /**
         * Sets the default config provider, used to generate the
         * config if it's missing.
         *
         * @param provider default config provider
         * @return current config request object
         * @see DefaultConfig
         */
        public ConfigRequest provider( DefaultConfig provider ) {
            this.provider = provider;
            return this;
        }

        /**
         * Loads the config from the filesystem.
         *
         * @return config object
         * @see SimpleConfigAPI
         */
        public SimpleConfigAPI request() {
            return new SimpleConfigAPI( this );
        }

        private String getConfig() {
            return provider.get( filename ) + "\n";
        }

    }

    /**
     * Creates new config request object, ideally `namespace`
     * should be the name of the mod id of the requesting mod
     *
     * @param filename - name of the config file
     * @return new config request object
     */
    public static ConfigRequest of( String filename ) {
        Path path = FabricLoader.getInstance().getConfigDir();
        return new ConfigRequest( path.resolve( filename + ".properties" ).toFile(), filename );
    }

    private void createConfig() throws IOException {

        // try creating missing files
        request.file.getParentFile().mkdirs();
        Files.createFile( request.file.toPath() );

        // write default config data
        PrintWriter writer = new PrintWriter(request.file, "UTF-8");
        writer.write( request.getConfig() );
        writer.close();

    }

    private void loadConfig() throws IOException {
        Scanner reader = new Scanner( request.file );
        for (int line = 1; reader.hasNextLine(); line++) {
            parseConfigEntry( reader.nextLine(), line );
        }
    }

    private void parseConfigEntry( String entry, int line ) {
        String entry_filtered = entry.replace(" ", "");
        if( !entry_filtered.isEmpty() && !entry_filtered.startsWith( "#" ) ) {
            String[] parts = entry_filtered.split("=", 2);
            if ( parts.length == 2 ) {
                config.put( parts[0], parts[1] );
            } else {
                throw new RuntimeException("Syntax error in config file on line " + line + "!");
            }
        }
    }

    private SimpleConfigAPI(ConfigRequest request ) {
        this.request = request;
        String identifier = "Config '" + request.filename + "'";

        if( !request.file.exists() ) {
            LOGGER.info( identifier + " is missing, generating default one..." );

            try {
                createConfig();
            } catch (IOException e) {
                LOGGER.error( identifier + " failed to generate!" );
                LOGGER.trace( e );
                broken = true;
            }
        }

        if( !broken ) {
            try {
                loadConfig();
            } catch (Exception e) {
                LOGGER.error( identifier + " failed to load!" );
                LOGGER.trace( e );
                broken = true;
            }
        }

    }

    /**
     * Queries a value from config, returns `null` if the
     * key does not exist.
     *
     * @return  value corresponding to the given key
     * @see     SimpleConfigAPI#getOrDefault
     */
    @Deprecated
    public String get( String key ) {
        return config.get( key );
    }

    @SuppressWarnings("unchecked")
    public <T> T getOrDefault(String key, T def, T min, boolean min_inclusive, T max, boolean max_inclusive) {
        String value = get(key);
        if (Objects.isNull(value)) return def;
        try {
            if (def instanceof Double) {
                Double parsedValue = Double.parseDouble(value);
                if (checkRange(parsedValue, (Double) min, min_inclusive, (Double) max, max_inclusive)) {
                    return (T) parsedValue;
                }
                return def;
            } else if (def instanceof Integer) {
                Integer parsedValue = Integer.parseInt(value);
                if (checkRange(parsedValue, (Integer) min, min_inclusive, (Integer) max, max_inclusive)) {
                    return (T) parsedValue;
                }
                return def;
            } else if (def instanceof Boolean) {
                return (T) Boolean.valueOf(value.equalsIgnoreCase("true"));
            } else if (def instanceof String) {
                return (T) value;
            } else {
                return def; // Default case if type is not handled
            }
        } catch (Exception e) {
            return def;
        }
    }
    private <N extends Number & Comparable<N>> boolean checkRange(N value, N min, boolean minInclusive, N max, boolean maxInclusive) {
        boolean isGreaterThanOrEqualMin = min == null || (minInclusive ? value.compareTo(min) >= 0 : value.compareTo(min) > 0);
        boolean isLessThanOrEqualMax = max == null || (maxInclusive ? value.compareTo(max) <= 0 : value.compareTo(max) < 0);
        return isGreaterThanOrEqualMin && isLessThanOrEqualMax;
    }
    public <T> T getOrDefault(String key, T def) {
        return getOrDefault(key, def, null, false, null, false);
    }



    /**
     * If any error occurred during loading or reading from the config
     * a 'broken' flag is set, indicating that the config's state
     * is undefined and should be discarded using `delete()`
     *
     * @return the 'broken' flag of the configuration
     */
    public boolean isBroken() {
        return broken;
    }

    /**
     * deletes the config file from the filesystem
     *
     * @return true if the operation was successful
     */
    public boolean delete() {
        LOGGER.warn( "Config '" + request.filename + "' was removed from existence! Restart the game to regenerate it." );
        return request.file.delete();
    }

}