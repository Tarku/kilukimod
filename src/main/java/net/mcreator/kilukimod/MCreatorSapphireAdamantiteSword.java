package net.mcreator.kilukimod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementskilukimod.ModElement.Tag
public class MCreatorSapphireAdamantiteSword extends Elementskilukimod.ModElement {
	@ObjectHolder("kilukimod:sapphireadamantitesword")
	public static final Item block = null;

	public MCreatorSapphireAdamantiteSword(Elementskilukimod instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1850;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MCreatorSapphire.block, (int) (1)));
			}
		}, 3, -1.5F, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("sapphireadamantitesword"));
	}
}
