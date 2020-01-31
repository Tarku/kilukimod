package net.mcreator.kilukimod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Elementskilukimod.ModElement.Tag
public class MCreatorEnhancedThermonitePowder extends Elementskilukimod.ModElement {
	@ObjectHolder("kilukimod:enhancedthermonitepowder")
	public static final Item block = null;

	public MCreatorEnhancedThermonitePowder(Elementskilukimod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64));
			setRegistryName("enhancedthermonitepowder");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
