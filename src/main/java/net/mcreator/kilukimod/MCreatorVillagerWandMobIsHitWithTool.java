package net.mcreator.kilukimod;

import net.minecraft.world.World;
import net.minecraft.world.Explosion;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.monster.WitchEntity;
import net.minecraft.entity.monster.StrayEntity;
import net.minecraft.entity.monster.HuskEntity;
import net.minecraft.entity.monster.GiantEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import java.util.Random;

@Elementskilukimod.ModElement.Tag
public class MCreatorVillagerWandMobIsHitWithTool extends Elementskilukimod.ModElement {
	public MCreatorVillagerWandMobIsHitWithTool(Elementskilukimod instance) {
		super(instance, 120);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorVillagerWandMobIsHitWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorVillagerWandMobIsHitWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorVillagerWandMobIsHitWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorVillagerWandMobIsHitWithTool!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure MCreatorVillagerWandMobIsHitWithTool!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorVillagerWandMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		World world = (World) dependencies.get("world");
		if (((kilukimodVariables.MapVariables.get(world).Magical_Power) >= 30)) {
			if ((((entity.getDisplayName().getFormattedText())).equals("Zombie Villager"))) {
				entity.remove();
				if (!world.isRemote) {
					Entity entityToSpawn = new VillagerEntity(EntityType.VILLAGER, world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0);
					world.addEntity(entityToSpawn);
				}
			}
			if ((((entity.getDisplayName().getFormattedText())).equals("Zombie"))) {
				entity.remove();
				if ((Math.round((Math.random() * 20)) == 19)) {
					if (!world.isRemote) {
						Entity entityToSpawn = new GiantEntity(EntityType.GIANT, world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0);
						world.addEntity(entityToSpawn);
					}
				} else {
					if (!world.isRemote) {
						Entity entityToSpawn = new HuskEntity(EntityType.HUSK, world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if ((((entity.getDisplayName().getFormattedText())).equals("Villager"))) {
				entity.remove();
				if (!world.isRemote) {
					Entity entityToSpawn = new WitchEntity(EntityType.WITCH, world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0);
					world.addEntity(entityToSpawn);
				}
			}
			if ((((entity.getDisplayName().getFormattedText())).equals("Skeleton"))) {
				entity.remove();
				if ((Math.round((Math.random() * 20)) == 19)) {
					if (!world.isRemote) {
						Entity entityToSpawn = new WitherSkeletonEntity(EntityType.WITHER_SKELETON, world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0);
						world.addEntity(entityToSpawn);
					}
				} else {
					if (!world.isRemote) {
						Entity entityToSpawn = new StrayEntity(EntityType.STRAY, world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if ((((entity.getDisplayName().getFormattedText())).equals("Creeper"))) {
				entity.remove();
				if (!world.isRemote) {
					world.createExplosion(null, (int) x, (int) y, (int) z, (float) 8, Explosion.Mode.BREAK);
				}
			}
			for (int _ct = 0; _ct < 10; _ct++) {
				world.addOptionalParticle(ParticleTypes.ANGRY_VILLAGER, x, y, z, 3, 3, 3);
			}
			if (itemstack.attemptDamageItem((int) 2, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setDamage(0);
			}
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 80);
			kilukimodVariables.MapVariables.get(world).Magical_Power = (double) ((kilukimodVariables.MapVariables.get(world).Magical_Power) - 30);
			kilukimodVariables.MapVariables.get(world).syncData(world);
		}
	}
}
