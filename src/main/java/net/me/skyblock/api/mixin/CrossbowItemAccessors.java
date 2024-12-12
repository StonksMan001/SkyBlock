package net.me.skyblock.api.mixin;

import com.sun.jna.platform.win32.WinDef;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(CrossbowItem.class)
public interface CrossbowItemAccessors {
    @Accessor
    public boolean getCharged();
    @Accessor
    public boolean getLoaded();
    @Accessor("charged")
    public void setCharged(boolean charged);
    @Accessor("loaded")
    public void setLoaded(boolean loaded);
    @Invoker("getSpeed")
    public static float getSpeed(ChargedProjectilesComponent stack) {
        throw new AssertionError();
    }
}
