package net.mcreator.kilukimod;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

@Elementskilukimod.ModElement.Tag
public class MCreatorMagicalPowerGetFromKilling extends Elementskilukimod.ModElement {
	public MCreatorMagicalPowerGetFromKilling(Elementskilukimod instance) {
		super(instance, 124);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorMagicalPowerGetFromKilling!");
			return;
		}
		World world = (World) dependencies.get("world");
		kilukimodVariables.MapVariables.get(world).Magical_Power = (double) ((kilukimodVariables.MapVariables.get(world).Magical_Power) + Math
				.round(((Math.random() * 2) + 1)));
		kilukimodVariables.MapVariables.get(world).syncData(world);
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getSource() != null && event.getSource().getTrueSource() != null) {
			Entity entity = event.getSource().getTrueSource();
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			World world = entity.world;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
