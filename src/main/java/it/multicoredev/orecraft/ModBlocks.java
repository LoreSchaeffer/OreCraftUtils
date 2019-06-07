package it.multicoredev.orecraft;

import it.multicoredev.orecraft.blocks.BlockBase;
import it.multicoredev.orecraft.blocks.CharcoalBlock;
import it.multicoredev.orecraft.blocks.CoalCokeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
    public static BlockBase coalCokeBlock = new CoalCokeBlock(Material.ROCK, "coal_coke_block",28800).setCreativeTab(OreCraft.creativeTab);
    public static BlockBase charcoalBlock = new CharcoalBlock(Material.ROCK, "charcoal_block", 14400).setCreativeTab(OreCraft.creativeTab);

    public static BlockBase barkOak = new BlockBase(Material.WOOD, "oak_bark").setCreativeTab(OreCraft.creativeTab);
    public static BlockBase barkSpruce = new BlockBase(Material.WOOD, "spruce_bark").setCreativeTab(OreCraft.creativeTab);
    public static BlockBase barkBirch = new BlockBase(Material.WOOD, "birch_bark").setCreativeTab(OreCraft.creativeTab);
    public static BlockBase barkJungle = new BlockBase(Material.WOOD, "jungle_bark").setCreativeTab(OreCraft.creativeTab);
    public static BlockBase barkAcacia = new BlockBase(Material.WOOD, "acacia_bark").setCreativeTab(OreCraft.creativeTab);
    public static BlockBase barkDarkOak = new BlockBase(Material.WOOD, "dark_oak_bark").setCreativeTab(OreCraft.creativeTab);

    /*Textures from CoFh Team under License https://github.com/CoFH/ThermalFoundation/blob/1.12/README.md*/
    public static BlockBase bronzeBlock = new BlockBase(Material.IRON, "bronze_block").setCreativeTab(OreCraft.creativeTab);

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                coalCokeBlock,
                charcoalBlock,
                barkOak,
                barkSpruce,
                barkBirch,
                barkJungle,
                barkAcacia,
                barkDarkOak,
                bronzeBlock
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                coalCokeBlock.createItemBlock(),
                charcoalBlock.createItemBlock(),
                barkOak.createItemBlock(),
                barkSpruce.createItemBlock(),
                barkBirch.createItemBlock(),
                barkJungle.createItemBlock(),
                barkAcacia.createItemBlock(),
                barkDarkOak.createItemBlock(),
                bronzeBlock.createItemBlock()
        );
    }

    public static void registerModels() {
        coalCokeBlock.registerItemModel(Item.getItemFromBlock(coalCokeBlock));
        charcoalBlock.registerItemModel(Item.getItemFromBlock(charcoalBlock));
        barkOak.registerItemModel(Item.getItemFromBlock(barkOak));
        barkSpruce.registerItemModel(Item.getItemFromBlock(barkSpruce));
        barkBirch.registerItemModel(Item.getItemFromBlock(barkBirch));
        barkJungle.registerItemModel(Item.getItemFromBlock(barkJungle));
        barkAcacia.registerItemModel(Item.getItemFromBlock(barkAcacia));
        barkDarkOak.registerItemModel(Item.getItemFromBlock(barkDarkOak));
        bronzeBlock.registerItemModel(Item.getItemFromBlock(bronzeBlock));
    }

    public static void registerOredict() {
        OreDictionary.registerOre("blockCoalCoke", coalCokeBlock);
        OreDictionary.registerOre("blockCharcoal", charcoalBlock);
        OreDictionary.registerOre("blockBronze", bronzeBlock);
    }
}
