package net.mcreator.kilukimod;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@Elementskilukimod.ModElement.Tag
public class MCreatorSapphireArmorHelmetTickEvent extends Elementskilukimod.ModElement {
	public MCreatorSapphireArmorHelmetTickEvent(Elementskilukimod instance) {
		super(instance, 91);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorSapphireArmorHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 7, (int) 2, (true), (false)));
	}
}
