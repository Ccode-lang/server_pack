
package net.mcreator.serverpack.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.serverpack.item.ItemTitaniumIngot;
import net.mcreator.serverpack.block.BlockTitaniumOre;
import net.mcreator.serverpack.ElementsServerPackMod;

@ElementsServerPackMod.ModElement.Tag
public class RecipeTitaniumOreSmelting extends ElementsServerPackMod.ModElement {
	public RecipeTitaniumOreSmelting(ElementsServerPackMod instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTitaniumOre.block, (int) (1)), new ItemStack(ItemTitaniumIngot.block, (int) (1)), 1.4F);
	}
}
