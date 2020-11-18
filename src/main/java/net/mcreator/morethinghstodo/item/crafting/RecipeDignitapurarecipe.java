
package net.mcreator.morethinghstodo.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.morethinghstodo.item.ItemDignitapura;
import net.mcreator.morethinghstodo.item.ItemDignita;
import net.mcreator.morethinghstodo.ElementsMorethinghstodoMod;

@ElementsMorethinghstodoMod.ModElement.Tag
public class RecipeDignitapurarecipe extends ElementsMorethinghstodoMod.ModElement {
	public RecipeDignitapurarecipe(ElementsMorethinghstodoMod instance) {
		super(instance, 11);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemDignita.block, (int) (1)), new ItemStack(ItemDignitapura.block, (int) (1)), 1F);
	}
}
