
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inteculinary.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.inteculinary.item.WoodenSkewerItem;
import net.mcreator.inteculinary.InteculinaryMod;

public class InteculinaryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, InteculinaryMod.MODID);
	public static final RegistryObject<Item> WOODEN_SKEWER = REGISTRY.register("wooden_skewer", () -> new WoodenSkewerItem());
}
