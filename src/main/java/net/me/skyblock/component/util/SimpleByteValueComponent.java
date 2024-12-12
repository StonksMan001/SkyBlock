package net.me.skyblock.component.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.dynamic.Codecs;

public record SimpleByteValueComponent(int value) {
    public static final Codec<SimpleByteValueComponent> CODEC = RecordCodecBuilder.create(nullComponentInstance ->
            nullComponentInstance.group(Codecs.UNSIGNED_BYTE.optionalFieldOf("value", 0).forGetter(SimpleByteValueComponent::getValue)).apply(nullComponentInstance, SimpleByteValueComponent::new));
    public SimpleByteValueComponent(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
}
