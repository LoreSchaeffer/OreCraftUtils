package it.multicoredev.orecraft;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModItems.ironDust, new ItemStack(Items.IRON_INGOT), 0.7f);
        GameRegistry.addSmelting(ModItems.goldDust, new ItemStack(Items.GOLD_INGOT), 0.7f);
        GameRegistry.addSmelting(ModItems.bronzeDust, new ItemStack(ModItems.bronzeIngot), 0.5f);
    }

}
