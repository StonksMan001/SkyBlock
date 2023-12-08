package net.me.skyblock.api.skycore;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

@Environment(value= EnvType.CLIENT)
public class SkyCore_TitleScreen extends Screen {
    protected SkyCore_TitleScreen(Text title) {
        super(title);
    }
}
