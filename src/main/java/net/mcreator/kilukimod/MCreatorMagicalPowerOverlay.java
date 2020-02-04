package net.mcreator.kilukimod;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

@Elementskilukimod.ModElement.Tag
public class MCreatorMagicalPowerOverlay extends Elementskilukimod.ModElement {
	public MCreatorMagicalPowerOverlay(Elementskilukimod instance) {
		super(instance, 122);
	}

	@Override
	public void initElements() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void eventHandler(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int posX = (event.getWindow().getScaledWidth()) / 2;
			int posY = (event.getWindow().getScaledHeight()) / 2;
			PlayerEntity entity = Minecraft.getInstance().player;
			World world = entity.world;
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			if ((true)) {
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("kilukimod:textures/656565dzada.png"));
				Minecraft.getInstance().ingameGUI.blit(posX + -216, posY + -117, 0, 0, 256, 256);
				Minecraft.getInstance().fontRenderer.drawString("" + (kilukimodVariables.MapVariables.get(world).Magical_Power) + "", posX + -183,
						posY + -112, -13421773);
			}
		}
	}
}
