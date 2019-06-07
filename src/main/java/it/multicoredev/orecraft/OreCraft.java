package it.multicoredev.orecraft;

import it.multicoredev.orecraft.commands.GmCommand;
import it.multicoredev.orecraft.commands.GmAdd;
import it.multicoredev.orecraft.commands.GmRemove;
import it.multicoredev.orecraft.proxy.CommonProxy;
import it.multicoredev.orecraft.yaml.Configuration;
import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = OreCraft.MODID, name = OreCraft.MODNAME, version = OreCraft.MODVERSION, useMetadata = true)
public class OreCraft {
    public static final String MODID = "orecraft";
    public static final String MODNAME = "OreCraft";
    public static final String MODVERSION= "1.2.0";

    public static final OreCreative creativeTab = new OreCreative();

    public static final Item.ToolMaterial TOOL_MATERIAL_BRONZE = EnumHelper.addToolMaterial("BRONZE", 2, 325, 6.0f, 2.0f, 10);
    public static final Item.ToolMaterial TOOL_MATERIAL_STEEL = EnumHelper.addToolMaterial("STEEL", 2, 400, 6.5F, 2.5F, 10);

    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_BRONZE = EnumHelper.addArmorMaterial("BRONZE", MODID + ":bronze", 18, new int[] { 2, 6, 6, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1F);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_STEEL = EnumHelper.addArmorMaterial("STEEL", MODID + ":steel", 22, new int[] { 3, 6, 8, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1F);

    public static Configuration config;

    @SidedProxy(clientSide = "it.multicoredev.orecraft.proxy.ClientProxy", serverSide = "it.multicoredev.orecraft.proxy.ServerProxy")
    public static CommonProxy proxy;
    @Mod.Instance
    public static OreCraft instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    @SideOnly(Side.SERVER)
    public void serverLoad(FMLServerStartingEvent event) {
        event.registerServerCommand(new GmAdd());
        event.registerServerCommand(new GmRemove());
        event.registerServerCommand(new GmCommand());
    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());

            ModItems.registerOredict();
            ModBlocks.registerOredict();
        }

        @SubscribeEvent
        public static void registerItemModels(ModelRegistryEvent event) {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }
    }
}
