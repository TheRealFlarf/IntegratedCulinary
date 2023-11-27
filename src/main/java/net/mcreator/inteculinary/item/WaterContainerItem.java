
package net.mcreator.inteculinary.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WaterContainerItem extends Item {
	public WaterContainerItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
