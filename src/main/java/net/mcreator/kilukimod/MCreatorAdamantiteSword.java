package net.mcreator.kilukimod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementskilukimod.ModElement.Tag
public class MCreatorAdamantiteSword extends Elementskilukimod.ModElement {
	@ObjectHolder("kilukimod:adamantitesword")
	public static final Item block = null;

	public MCreatorAdamantiteSword(Elementskilukimod instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1024;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 5.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 3, -3F, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("adamantitesword"));
	}
}
