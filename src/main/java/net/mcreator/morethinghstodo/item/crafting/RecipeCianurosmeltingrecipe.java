
package net.mcreator.morethinghstodo.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.morethinghstodo.item.ItemCianuro;
import net.mcreator.morethinghstodo.ElementsMorethinghstodoMod;

@ElementsMorethinghstodoMod.ModElement.Tag
public class RecipeCianurosmeltingrecipe extends ElementsMorethinghstodoMod.ModElement {
	public RecipeCianurosmeltingrecipe(ElementsMorethinghstodoMod instance) {
		super(instance, 12);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemCianuro.block, (int) (1)), new ItemStack(Blocks.DIAMOND_BLOCK, (int) (1)), 1F);
	}
}
