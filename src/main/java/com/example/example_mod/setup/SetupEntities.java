package com.example.example_mod.setup;

import com.example.example_mod.ExampleMod;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class SetupEntities {

	public static List<EntityType<?>> entities = new ArrayList<>();

//	public static final EntityType<CubesEntity> CUBES = FabricEntityTypeBuilder.createMob()
//			.spawnGroup(SpawnGroup.MONSTER)
//			.entityFactory(CubesEntity::new)
//			.dimensions(EntityDimensions.changing(0.6F, 2.7F))
//			.build();

	private static void register(String name, EntityType<?> type) {
		entities.add(type);
		Registry.register(Registry.ENTITY_TYPE, new Identifier(ExampleMod.MOD_ID, name), type);
	}

	public static void registerEntities(){
//		register();
	}
}
