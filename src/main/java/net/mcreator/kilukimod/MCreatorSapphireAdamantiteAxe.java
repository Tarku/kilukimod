package net.mcreator.kilukimod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

@Elementskilukimod.ModElement.Tag
public class MCreatorSapphireAdamantiteAxe extends Elementskilukimod.ModElement {
	@ObjectHolder("kilukimod:sapphireadamantiteaxe")
	public static final Item block = null;

	public MCreatorSapphireAdamantiteAxe(Elementskilukimod instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1850;
			}

			public float getEfficiency() {
				return 25f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 50;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MCreatorSapphire.block, (int) (1)));
			}
		}, 1, -1.5F, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("sapphireadamantiteaxe"));
	}
}
