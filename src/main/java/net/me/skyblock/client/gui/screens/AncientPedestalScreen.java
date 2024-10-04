package net.me.skyblock.client.gui.screens;

import com.mojang.blaze3d.systems.RenderSystem;
import net.me.skyblock.SkyBlock;
import net.me.skyblock.blocks_and_items.ModItems;
import net.me.skyblock.client.gui.screen_handlers.AncientPedestalScreenHandler;
import net.me.skyblock.server.UniversalAncientPedestalOffers;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import oshi.util.tuples.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AncientPedestalScreen extends HandledScreen<AncientPedestalScreenHandler> {
    private static final Identifier TEXTURE = SkyBlock.identifierOfSkyBlock("textures/gui/skyblock__ancient_pedestal/skyblock__ancient_pedestal_screen.png");
    private static final Identifier EMPTY_TOKEN_SLOT_TEXTURE = SkyBlock.identifierOfSkyBlock("textures/gui/skyblock__ancient_pedestal/skyblock__empty_token_slot.png");
    public AncientPedestalScreen(AncientPedestalScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleY = 1000;
        playerInventoryTitleY = 1000;
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        context.drawTexture(TEXTURE, x, y, 0 ,0, backgroundWidth, backgroundHeight);

    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        /*Set<Item> requirement_set = UniversalAncientPedestalOffers.currentDeque().keySet();
        Object[] requirement_array = requirement_set.toArray();
        context.drawItem(((Item)requirement_array[2]).getDefaultStack(), x+39, y+14);
        context.drawItem(((Item)requirement_array[1]).getDefaultStack(), x+39, y+33);
        context.drawItem(((Item)requirement_array[0]).getDefaultStack(), x+39, y+52);
        for (Object obj: requirement_array) {
            Item item = (Item)obj;
            int i;
            if (item == requirement_array[0]) {i = 52;} else if (item == requirement_array[1]) {i = 33;} else {i = 14;}
            UniversalAncientPedestalOffers.Tier tier = UniversalAncientPedestalOffers.currentDeque().get(item);
            if (tier == UniversalAncientPedestalOffers.Tier.RED) {
                context.drawItem(ModItems.SKYBLOCK__RARE_TOKEN.getDefaultStack(), x+68, y + i);
            } else if (tier == UniversalAncientPedestalOffers.Tier.YELLOW) {
                context.drawItem(ModItems.SKYBLOCK__UNCOMMON_TOKEN.getDefaultStack(), x+68, y + i);
            } else if (tier == UniversalAncientPedestalOffers.Tier.GREEN) {
                context.drawItem(ModItems.SKYBLOCK__COMMON_TOKEN.getDefaultStack(), x+68, y + i);
            }
        }*/
    }
}
