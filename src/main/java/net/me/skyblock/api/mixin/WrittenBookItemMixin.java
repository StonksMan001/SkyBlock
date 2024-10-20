package net.me.skyblock.api.mixin;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.WrittenBookContentComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.WrittenBookItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.StringHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.List;

@Mixin(WrittenBookItem.class)
public abstract class WrittenBookItemMixin {
    @ModifyVariable(method = "<init>", at = @At(value = "HEAD"), argsOnly = true)
    private static Item.Settings removingEnchantmentGlintComponent(Item.Settings settings) {
        return settings.component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, null);
    }
    @Inject(method = "appendTooltip", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/StringHelper;isBlank(Ljava/lang/String;)Z", shift = At.Shift.BEFORE), locals = LocalCapture.CAPTURE_FAILHARD)
    private void appendOriginalTitle(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type, CallbackInfo ci, WrittenBookContentComponent writtenBookContentComponent) {
        if (!StringHelper.isBlank(writtenBookContentComponent.title().toString())) {
            tooltip.add(Text.translatable("book.original_title").formatted(Formatting.GRAY).append(Text.literal(writtenBookContentComponent.title().raw().formatted(Formatting.GRAY))));
        }
    }
}
