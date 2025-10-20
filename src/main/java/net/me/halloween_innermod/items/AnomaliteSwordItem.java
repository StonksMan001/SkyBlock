package net.me.halloween_innermod.items;

import net.me.halloween_innermod.registries.H_GameRules;
import net.me.skycore_supermod.item_utils.custom_unenchantable.UnenchantableSwordItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.ParticleTypes;

public class AnomaliteSwordItem extends UnenchantableSwordItem { //TODO
    public AnomaliteSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    /*
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        //TODO
        if (target.getWorld().getGameRules().getBoolean(H_GameRules.H__ENABLE_HALLOWEEN_EFFECTS) && attacker instanceof PlayerEntity) {
            attacker.getWorld().addParticle(ParticleTypes.ANGRY_VILLAGER, target.getParticleX(0.5), target.getRandomBodyY(), target.getParticleZ(0.5), 0.0, 0.0, 0.0);
        }
        return super.postHit(stack, target, attacker);
    }
    @Override
    public float getBonusAttackDamage(Entity target, float baseAttackDamage, DamageSource damageSource) {
        if (target.getWorld().getGameRules().getBoolean(H_GameRules.H__ENABLE_HALLOWEEN_EFFECTS) && damageSource.getAttacker() instanceof PlayerEntity) {
            return 100.0f;
        }
        return super.getBonusAttackDamage(target, baseAttackDamage, damageSource);
    }*/
}
