
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inteculinary.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.inteculinary.item.WoodenSkewerItem;
import net.mcreator.inteculinary.item.WaterContainerItem;
import net.mcreator.inteculinary.item.SugarIngotItem;
import net.mcreator.inteculinary.item.SkeweredAppleItem;
import net.mcreator.inteculinary.item.MilkContainerItem;
import net.mcreator.inteculinary.item.MelmersClassGlueItem;
import net.mcreator.inteculinary.item.EmptyGlassJarItem;
import net.mcreator.inteculinary.item.BakedAppleOnStickItem;
import net.mcreator.inteculinary.item.BakedAppleItem;
import net.mcreator.inteculinary.InteculinaryMod;

public class InteculinaryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, InteculinaryMod.MODID);
	public static final RegistryObject<Item> WOODEN_SKEWER = REGISTRY.register("wooden_skewer", () -> new WoodenSkewerItem());
	public static final RegistryObject<Item> EMPTY_GLASS_JAR = REGISTRY.register("empty_glass_jar", () -> new EmptyGlassJarItem());
	public static final RegistryObject<Item> SUGAR_INGOT = REGISTRY.register("sugar_ingot", () -> new SugarIngotItem());
	public static final RegistryObject<Item> SKEWERED_APPLE = REGISTRY.register("skewered_apple", () -> new SkeweredAppleItem());
	public static final RegistryObject<Item> BAKED_APPLE_ON_STICK = REGISTRY.register("baked_apple_on_stick", () -> new BakedAppleOnStickItem());
	public static final RegistryObject<Item> BAKED_APPLE = REGISTRY.register("baked_apple", () -> new BakedAppleItem());
	public static final RegistryObject<Item> MELMERS_CLASS_GLUE = REGISTRY.register("melmers_class_glue", () -> new MelmersClassGlueItem());
	public static final RegistryObject<Item> WATER_CONTAINER = REGISTRY.register("water_container", () -> new WaterContainerItem());
	public static final RegistryObject<Item> MILK_CONTAINER = REGISTRY.register("milk_container", () -> new MilkContainerItem());
}
