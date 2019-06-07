package it.multicoredev.orecraft;

import it.multicoredev.orecraft.items.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
    public static ItemBase cent1 = new ItemBase("cent1").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase cent2 = new ItemBase("cent2").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase cent5 = new ItemBase("cent5").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase cent10 = new ItemBase("cent10").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase cent20 = new ItemBase("cent20").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase cent50 = new ItemBase("cent50").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase euro1 = new ItemBase("euro1").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase euro2 = new ItemBase("euro2").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase euro5 = new ItemBase("euro5").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase euro10 = new ItemBase("euro10").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase euro20 = new ItemBase("euro20").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase euro50 = new ItemBase("euro50").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase euro100 = new ItemBase("euro100").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase euro200 = new ItemBase("euro200").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase euro500 = new ItemBase("euro500").setCreativeTab(OreCraft.creativeTab);

    public static ItemBase ironGear = new ItemBase("iron_gear").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase coalCoke = new ItemFuel("coal_coke", 3200).setCreativeTab(OreCraft.creativeTab);
    public static ItemBase processor = new ItemBase("processor").setCreativeTab(OreCraft.creativeTab);

    /*Textures from CoFh Team under License https://github.com/CoFH/ThermalFoundation/blob/1.12/README.md*/
    public static ItemBase ironDust = new ItemBase("iron_dust").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase goldDust = new ItemBase("gold_dust").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase copperDust = new ItemBase("copper_dust").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase tinDust = new ItemBase("tin_dust").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase silverDust = new ItemBase("silver_dust").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase bronzeDust = new ItemBase("bronze_dust").setCreativeTab(OreCraft.creativeTab);
    public static ItemBase bronzeIngot = new ItemBase("bronze_ingot").setCreativeTab(OreCraft.creativeTab);

    public static ItemSword bronzeSword = new ItemSword(OreCraft.TOOL_MATERIAL_BRONZE, "bronze_sword").setCreativeTab(OreCraft.creativeTab);
    public static ItemPickaxe bronzePickaxe = new ItemPickaxe(OreCraft.TOOL_MATERIAL_BRONZE, "bronze_pickaxe").setCreativeTab(OreCraft.creativeTab);
    public static ItemAxe bronzeAxe = new ItemAxe(OreCraft.TOOL_MATERIAL_BRONZE, "bronze_axe").setCreativeTab(OreCraft.creativeTab);
    public static ItemShovel bronzeShovel = new ItemShovel(OreCraft.TOOL_MATERIAL_BRONZE, "bronze_shovel").setCreativeTab(OreCraft.creativeTab);
    public static ItemHoe bronzeHoe = new ItemHoe(OreCraft.TOOL_MATERIAL_BRONZE, "bronze_hoe").setCreativeTab(OreCraft.creativeTab);
    public static ItemSword steelSword = new ItemSword(OreCraft.TOOL_MATERIAL_STEEL, "steel_sword").setCreativeTab(OreCraft.creativeTab);
    public static ItemPickaxe steelPickaxe = new ItemPickaxe(OreCraft.TOOL_MATERIAL_STEEL, "steel_pickaxe").setCreativeTab(OreCraft.creativeTab);
    public static ItemAxe steelAxe = new ItemAxe(OreCraft.TOOL_MATERIAL_STEEL, "steel_axe").setCreativeTab(OreCraft.creativeTab);
    public static ItemShovel steelShovel = new ItemShovel(OreCraft.TOOL_MATERIAL_STEEL, "steel_shovel").setCreativeTab(OreCraft.creativeTab);
    public static ItemHoe steelHoe = new ItemHoe(OreCraft.TOOL_MATERIAL_STEEL, "steel_hoe").setCreativeTab(OreCraft.creativeTab);

    public static ItemPaxel bronzePaxel = new ItemPaxel(OreCraft.TOOL_MATERIAL_BRONZE, "bronze_paxel").setCreativeTab(OreCraft.creativeTab);
    public static ItemPaxel steelPaxel = new ItemPaxel(OreCraft.TOOL_MATERIAL_STEEL, "steel_paxel").setCreativeTab(OreCraft.creativeTab);

    public static ItemArmor bronzeHelmet = new ItemArmor(OreCraft.ARMOR_MATERIAL_BRONZE, EntityEquipmentSlot.HEAD, "bronze_helmet").setCreativeTab(OreCraft.creativeTab);
    public static ItemArmor bronzeChestplate = new ItemArmor(OreCraft.ARMOR_MATERIAL_BRONZE, EntityEquipmentSlot.CHEST, "bronze_chestplate").setCreativeTab(OreCraft.creativeTab);
    public static ItemArmor bronzeLeggings = new ItemArmor(OreCraft.ARMOR_MATERIAL_BRONZE, EntityEquipmentSlot.LEGS, "bronze_leggings").setCreativeTab(OreCraft.creativeTab);
    public static ItemArmor bronzeBoots = new ItemArmor(OreCraft.ARMOR_MATERIAL_BRONZE, EntityEquipmentSlot.FEET, "bronze_boots").setCreativeTab(OreCraft.creativeTab);
    public static ItemArmor steelHelmet = new ItemArmor(OreCraft.ARMOR_MATERIAL_STEEL, EntityEquipmentSlot.HEAD, "steel_helmet").setCreativeTab(OreCraft.creativeTab);
    public static ItemArmor steelChestplate = new ItemArmor(OreCraft.ARMOR_MATERIAL_STEEL, EntityEquipmentSlot.CHEST, "steel_chestplate").setCreativeTab(OreCraft.creativeTab);
    public static ItemArmor steelLeggings = new ItemArmor(OreCraft.ARMOR_MATERIAL_STEEL, EntityEquipmentSlot.LEGS, "steel_leggings").setCreativeTab(OreCraft.creativeTab);
    public static ItemArmor steelBoots = new ItemArmor(OreCraft.ARMOR_MATERIAL_STEEL, EntityEquipmentSlot.FEET, "steel_boots").setCreativeTab(OreCraft.creativeTab);

    public static void register(IForgeRegistry<Item> registry) {
        registry.register(cent1);
        registry.register(cent2);
        registry.register(cent5);
        registry.register(cent10);
        registry.register(cent20);
        registry.register(cent50);
        registry.register(euro1);
        registry.register(euro2);
        registry.register(euro5);
        registry.register(euro10);
        registry.register(euro20);
        registry.register(euro50);
        registry.register(euro100);
        registry.register(euro200);
        registry.register(euro500);
        registry.register(ironGear);
        registry.register(coalCoke);
        registry.register(processor);
        registry.register(ironDust);
        registry.register(goldDust);
        registry.register(copperDust);
        registry.register(tinDust);
        registry.register(silverDust);
        registry.register(bronzeDust);
        registry.register(bronzeIngot);

        registry.register(bronzeSword);
        registry.register(bronzePickaxe);
        registry.register(bronzeAxe);
        registry.register(bronzeShovel);
        registry.register(bronzeHoe);
        registry.register(steelSword);
        registry.register(steelPickaxe);
        registry.register(steelAxe);
        registry.register(steelShovel);
        registry.register(steelHoe);

        registry.register(bronzePaxel);
        registry.register(steelPaxel);

        registry.register(bronzeHelmet);
        registry.register(bronzeChestplate);
        registry.register(bronzeLeggings);
        registry.register(bronzeBoots);
        registry.register(steelHelmet);
        registry.register(steelChestplate);
        registry.register(steelLeggings);
        registry.register(steelBoots);
    }

    public static void registerModels() {
        cent1.registerItemModel();
        cent2.registerItemModel();
        cent5.registerItemModel();
        cent10.registerItemModel();
        cent20.registerItemModel();
        cent50.registerItemModel();
        euro1.registerItemModel();
        euro2.registerItemModel();
        euro5.registerItemModel();
        euro10.registerItemModel();
        euro20.registerItemModel();
        euro50.registerItemModel();
        euro100.registerItemModel();
        euro200.registerItemModel();
        euro500.registerItemModel();
        ironGear.registerItemModel();
        coalCoke.registerItemModel();
        processor.registerItemModel();
        ironDust.registerItemModel();
        goldDust.registerItemModel();
        copperDust.registerItemModel();
        tinDust.registerItemModel();
        silverDust.registerItemModel();
        bronzeDust.registerItemModel();
        bronzeIngot.registerItemModel();

        bronzeSword.registerItemModel();
        bronzePickaxe.registerItemModel();
        bronzeAxe.registerItemModel();
        bronzeShovel.registerItemModel();
        bronzeHoe.registerItemModel();
        steelSword.registerItemModel();
        steelPickaxe.registerItemModel();
        steelAxe.registerItemModel();
        steelShovel.registerItemModel();
        steelHoe.registerItemModel();

        bronzePaxel.registerItemModel();
        steelPaxel.registerItemModel();

        bronzeHelmet.registerItemModel();
        bronzeChestplate.registerItemModel();
        bronzeLeggings.registerItemModel();
        bronzeBoots.registerItemModel();
        steelHelmet.registerItemModel();
        steelChestplate.registerItemModel();
        steelLeggings.registerItemModel();
        steelBoots.registerItemModel();
    }

    public static void registerOredict() {
        OreDictionary.registerOre("gearIron", ironGear);
        OreDictionary.registerOre("coalCoke", coalCoke);
        OreDictionary.registerOre("dustIron", ironDust);
        OreDictionary.registerOre("dustGold", goldDust);
        OreDictionary.registerOre("dustCopper", copperDust);
        OreDictionary.registerOre("dustTin", tinDust);
        OreDictionary.registerOre("dustSilver", silverDust);
        OreDictionary.registerOre("dustBronze", bronzeDust);
        OreDictionary.registerOre("ingotBronze", bronzeIngot);
    }

}
