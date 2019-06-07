package it.multicoredev.orecraft.commands;

import it.multicoredev.orecraft.OreCraft;
import it.multicoredev.orecraft.yaml.ConfigManager;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.Loader;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GmAdd implements ICommand {
    @Override
    public String getName() {
        return "gmadd";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/gmadd <name>";
    }

    @Override
    public List<String> getAliases() {
        List<String> alias = new ArrayList<>();
        alias.add("gma");
        return alias;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if(args.length != 1) {
            sender.sendMessage(new TextComponentString("Incorrect usage! Correct use /gmadd <name>"));
            return;
        }

        String player = args[0].toLowerCase();
        List<String> allowedPlayers = OreCraft.config.getStringList("gm-allowed-players");

        if(allowedPlayers.contains(player)) {
            sender.sendMessage(new TextComponentString("Already in list"));
        } else {
            allowedPlayers.add(player.toLowerCase());
            OreCraft.config.set("gm-allowed-players", allowedPlayers);
            try {
                ConfigManager cm = new ConfigManager();
                cm.saveConfig(OreCraft.config, new File(Loader.instance().getConfigDir(), "OreCraft.yml"));
                cm.loadConfig(new File(Loader.instance().getConfigDir(), "OreCraft.yml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            sender.sendMessage(new TextComponentString(player + " added to list"));
        }
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        if(!OreCraft.config.getBoolean("gm-command-enabled")) return false;
        return sender.canUseCommand(4, "gmadd");
    }

    @Override
    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos) {
        PlayerList playerList = server.getPlayerList();
        List<String> players = Arrays.asList(playerList.getOnlinePlayerNames());

        return players;

        /*if(args.length != 1) {
            return players;
        } else {
            for(String player : players) {
                if(!player.startsWith(args[0].toLowerCase())) {
                    players.remove(player);
                }
            }

            return players;
        }*/
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
}
