
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inteculinary.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.inteculinary.InteculinaryMod;

public class InteculinaryModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InteculinaryMod.MODID);
	public static final RegistryObject<CreativeModeTab> INTEGRATED_CULINARY_ITEMS = REGISTRY.register("integrated_culinary_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.inteculinary.integrated_culinary_items")).icon(() -> new ItemStack(Items.BREAD)).displayItems((parameters, tabData) -> {
				tabData.accept(InteculinaryModItems.WOODEN_SKEWER.get());
				tabData.accept(InteculinaryModItems.EMPTY_GLASS_JAR.get());
				tabData.accept(InteculinaryModItems.SUGAR_INGOT.get());
				tabData.accept(InteculinaryModItems.SKEWERED_APPLE.get());
				tabData.accept(InteculinaryModItems.BAKED_APPLE_ON_STICK.get());
			}).withSearchBar().build());
}
