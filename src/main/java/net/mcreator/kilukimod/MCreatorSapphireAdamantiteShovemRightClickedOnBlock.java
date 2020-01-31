package net.mcreator.kilukimod;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import java.util.Random;

@Elementskilukimod.ModElement.Tag
public class MCreatorSapphireAdamantiteShovemRightClickedOnBlock extends Elementskilukimod.ModElement {
	public MCreatorSapphireAdamantiteShovemRightClickedOnBlock(Elementskilukimod instance) {
		super(instance, 40);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorSapphireAdamantiteShovemRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorSapphireAdamantiteShovemRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorSapphireAdamantiteShovemRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure MCreatorSapphireAdamantiteShovemRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorSapphireAdamantiteShovemRightClickedOnBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock())) {
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setDamage(0);
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.GRASS_PATH.getDefaultState(), 3);
		}
	}
}
