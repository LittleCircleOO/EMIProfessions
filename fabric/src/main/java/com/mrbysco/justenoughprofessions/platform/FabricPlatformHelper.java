package com.mrbysco.justenoughprofessions.platform;

import com.mrbysco.justenoughprofessions.platform.services.IPlatformHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.npc.VillagerProfession;

public class FabricPlatformHelper implements IPlatformHelper {

	@Override
	public ResourceLocation getEntityKey(EntityType<?> entityType) {
		return BuiltInRegistries.ENTITY_TYPE.getKey(entityType);
	}

	@Override
	public ResourceLocation getProfessionKey(VillagerProfession villagerProfession) {
		return BuiltInRegistries.VILLAGER_PROFESSION.getKey(villagerProfession);
	}
}
