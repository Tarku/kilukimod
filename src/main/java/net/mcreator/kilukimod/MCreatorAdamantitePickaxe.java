package net.mcreator.kilukimod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementskilukimod.ModElement.Tag
public class MCreatorAdamantitePickaxe extends Elementskilukimod.ModElement {
	@ObjectHolder("kilukimod:adamantitepickaxe")
	public static final Item block = null;

	public MCreatorAdamantitePickaxe(Elementskilukimod instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1024;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 48;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MCreatorAdamantiteIngot.block, (int) (1)));
			}
		}, 1, -1.9F, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("adamantitepickaxe"));
	}
}
