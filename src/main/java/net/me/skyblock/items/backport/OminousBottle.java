package net.me.skyblock.items.backport;

@Deprecated
public class OminousBottle {
//
//    private static final int MAX_USE_TIME = 30;
//    public OminousBottle(Settings settings) {
//        super(settings);
//    }
//    @Override
//    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
//        super.finishUsing(stack, world, user);
//        if (user instanceof ServerPlayerEntity serverPlayerEntity) {
//            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
//            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
//        }
//        if (!world.isClient) {
//            int rand = (int)(Math.random()*5);
//            user.addStatusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 20/*tick*/*60/*sec*/*100/*min*/, rand, false, true, true));
//            if (user instanceof PlayerEntity playerEntity && !playerEntity.getAbilities().creativeMode) {
//                stack.decrement(1);
//            }
//        }
//        return stack;
//    }
//
//    @Override
//    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
//        Text text1 = Text.translatable("effect.minecraft.bad_omen").formatted(Formatting.BLUE);
//        Text text2 = Text.literal(" I-V (01:40:00)").formatted(Formatting.BLUE);
//        tooltip.add(text1.copy().append(text2));
//    }
//
//    @Override
//    public int getMaxUseTime(ItemStack stack) {
//        return MAX_USE_TIME;
//    }
//
//    @Override
//    public UseAction getUseAction(ItemStack stack) {
//        return UseAction.DRINK;
//    }
//
//    @Override
//    public SoundEvent getDrinkSound() {
//        return SoundEvents.ENTITY_GENERIC_DRINK;
//    }
//
//    @Override
//    public SoundEvent getEatSound() {
//        return SoundEvents.ENTITY_GENERIC_DRINK;
//    }
//
//    @Override
//    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
//        return ItemUsage.consumeHeldItem(world, user, hand);
//    }
//
}
