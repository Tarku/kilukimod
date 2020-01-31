package net.mcreator.kilukimod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

@Elementskilukimod.ModElement.Tag
public class MCreatorAdamantiteAxe extends Elementskilukimod.ModElement {
	@ObjectHolder("kilukimod:adamantiteaxe")
	public static final Item block = null;

	public MCreatorAdamantiteAxe(Elementskilukimod instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1024;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 5.5f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MCreatorAdamantiteIngot.block, (int) (1)));
			}
		}, 1, -2.5F, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("adamantiteaxe"));
	}
}
