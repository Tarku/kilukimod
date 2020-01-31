package net.mcreator.kilukimod;

import net.minecraft.entity.Entity;

@Elementskilukimod.ModElement.Tag
public class MCreatorGolemAdamantiteArmorHelmetTickEvent extends Elementskilukimod.ModElement {
	public MCreatorGolemAdamantiteArmorHelmetTickEvent(Elementskilukimod instance) {
		super(instance, 109);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorGolemAdamantiteArmorHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("entity", entity);
			MCreatorAdamantiteArmorHelmetTickEvent.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("entity", entity);
			MCreatorGolemArmorHelmetTickEvent.executeProcedure($_dependencies);
		}
	}
}
