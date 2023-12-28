package net.me.skyblock.api.mixin;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.WrittenBookItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.StringHelper;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import java.util.List;

@Mixin(WrittenBookItem.class)
public abstract class WrittenBookItemMixin extends Item {
    public WrittenBookItemMixin(Settings settings) {
        super(settings);
    }
    @Final @Shadow public static String AUTHOR_KEY;
    @Final @Shadow public static String GENERATION_KEY;
    @Final @Shadow public static String TITLE_KEY;
    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }
    @Override
    public Text getName(ItemStack stack) {
        String string;
        NbtCompound nbtCompound = stack.getNbt();
        if (nbtCompound != null && !StringHelper.isEmpty(string = nbtCompound.getString(TITLE_KEY))) {
            return Text.literal(string);
        }
        return super.getName(stack);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.hasNbt()) {
            NbtCompound nbtCompound = stack.getNbt();
            assert nbtCompound != null;
            tooltip.add(Text.translatable("book.original_title").formatted(Formatting.GRAY).append(Text.literal(nbtCompound.getString(TITLE_KEY).formatted(Formatting.GRAY))));
            String string = nbtCompound.getString(AUTHOR_KEY);
            if (!StringHelper.isEmpty(string)) {
                tooltip.add(Text.translatable("book.byAuthor", string).formatted(Formatting.GRAY));
            }
            tooltip.add(Text.translatable("book.generation." + nbtCompound.getInt(GENERATION_KEY)).formatted(Formatting.GRAY));
        }
    }
}
