package com.mrbysco.justenoughprofessions.platform.services;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.npc.VillagerProfession;

public interface IPlatformHelper {

	/**
	 * Get the registry name of the entitytype
	 *
	 * @param entityType The entity type
	 * @return The registry name
	 */
	ResourceLocation getEntityKey(EntityType<?> entityType);

	/**
	 * Get the registry name of the profession
	 *
	 * @param villagerProfession The villager profession
	 * @return The registry name
	 */
	ResourceLocation getProfessionKey(VillagerProfession villagerProfession);
}
