package net.mcreator.kilukimod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementskilukimod.ModElement.Tag
public class MCreatorSapphireAdamantitePickaxe extends Elementskilukimod.ModElement {
	@ObjectHolder("kilukimod:sapphireadamantitepickaxe")
	public static final Item block = null;

	public MCreatorSapphireAdamantitePickaxe(Elementskilukimod instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1850;
			}

			public float getEfficiency() {
				return 35f;
			}

			public float getAttackDamage() {
				return 4f;
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
		}.setRegistryName("sapphireadamantitepickaxe"));
	}
}
