
package net.mcreator.inteculinary.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptyGlassJarItem extends Item {
	public EmptyGlassJarItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
