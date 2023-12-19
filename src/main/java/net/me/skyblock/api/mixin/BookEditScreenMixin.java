package net.me.skyblock.api.mixin;

import net.minecraft.client.gui.screen.ingame.BookEditScreen;
import net.minecraft.client.util.SelectionManager;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(BookEditScreen.class)
public abstract class BookEditScreenMixin {
    @Shadow protected abstract void setClipboard(String clipboard);

    @Shadow
    private String getClipboard() {
        return null;
    }
    @Shadow
    private String title;
    @Shadow
    @Mutable
    private final SelectionManager bookTitleSelectionManager = new SelectionManager(() -> this.title, title -> {
        this.title = title;
    }, this::getClipboard, this::setClipboard, string -> string.length() <= 20);
}
