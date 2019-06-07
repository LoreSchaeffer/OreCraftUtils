package it.multicoredev.orecraft.proxy;

import it.multicoredev.orecraft.OreCraft;
import it.multicoredev.orecraft.yaml.ConfigManager;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ServerProxy extends CommonProxy {
    public void preInit(FMLPreInitializationEvent event){
        super.preInit(event);
    }

    public void init(FMLInitializationEvent event) {
        super.init(event);
        initConfig();
    }

    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    private void initConfig() {
        File configFile = new File(Loader.instance().getConfigDir(), "OreCraft.yml");
        ConfigManager cm = new ConfigManager();

        if (!configFile.exists() || !configFile.isFile()) {
            try {
                configFile.createNewFile();
                OreCraft.config.set("default-gamemode", 3);
                OreCraft.config.set("gm-command-enabled", true);
                OreCraft.config.set("gm-allowed-players", new ArrayList<String>());
                cm.saveConfig(OreCraft.config, configFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            OreCraft.config = cm.loadConfig(configFile);

            if(!OreCraft.config.contains("default-gamemode")) {
                OreCraft.config.set("default-gamemode", 3);
            }
            if(!OreCraft.config.contains("gm-command-enabled")) {
                OreCraft.config.set("gm-command-enabled", true);
            }
            if(!OreCraft.config.contains("gm-allowed-players")) {
                OreCraft.config.set("gm-allowed-players", new ArrayList<String>());
            }
            cm.saveConfig(OreCraft.config, configFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
