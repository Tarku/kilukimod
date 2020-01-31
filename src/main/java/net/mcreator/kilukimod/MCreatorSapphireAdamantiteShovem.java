package net.mcreator.kilukimod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.ActionResultType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;

@Elementskilukimod.ModElement.Tag
public class MCreatorSapphireAdamantiteShovem extends Elementskilukimod.ModElement {
	@ObjectHolder("kilukimod:sapphireadamantiteshovem")
	public static final Item block = null;

	public MCreatorSapphireAdamantiteShovem(Elementskilukimod instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1850;
			}

			public float getEfficiency() {
				return 25f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MCreatorSapphire.block, (int) (1)));
			}
		}, 1, -0.9F, new Item.Properties().group(ItemGroup.TOOLS)) {
			@Override
			public ActionResultType onItemUse(ItemUseContext context) {
				ActionResultType retval = super.onItemUse(context);
				World world = context.getWorld();
				BlockPos pos = context.getPos();
				PlayerEntity entity = context.getPlayer();
				Direction direction = context.getFace();
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				ItemStack itemstack = context.getItem();
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("itemstack", itemstack);
					$_dependencies.put("world", world);
					MCreatorSapphireAdamantiteShovemRightClickedOnBlock.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("sapphireadamantiteshovem"));
	}
}
