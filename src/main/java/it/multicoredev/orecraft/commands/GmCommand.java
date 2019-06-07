package it.multicoredev.orecraft.commands;

import it.multicoredev.orecraft.OreCraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.GameType;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class GmCommand implements ICommand {
    @Override
    public String getName() {
        return "gm";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/gm 0, /gm 2, /gm 3";
    }

    @Override
    public List<String> getAliases() {
        return new ArrayList<>();
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if(args.length != 1) {
            sender.sendMessage(new TextComponentString("Incorrect usage! Correct use /gm 0, /gm 2, /gm 3"));
            return;
        }

        World world = sender.getEntityWorld();
        EntityPlayer player = world.getPlayerEntityByName(sender.getName());
        if(player == null) return;

        if(args[0].equals("0")) {
            player.setGameType(GameType.SURVIVAL);
            sender.sendMessage(new TextComponentString("Gamemode set to SURVIVAL"));
        }
        else if(args[0].equals("1")) {
            if(!sender.getName().equals("LoreSchaeffer")) {
                sender.sendMessage(new TextComponentTranslation("commands.generic.permission"));
                return;
            }

            player.setGameType(GameType.CREATIVE);
            sender.sendMessage(new TextComponentString("Gamemode set to CREATIVE"));
        }
        else if(args[0].equals("2")) {
            player.setGameType(GameType.ADVENTURE);
            sender.sendMessage(new TextComponentString("Gamemode set to ADVENTURE"));
        }
        else if(args[0].equals("3")) {
            player.setGameType(GameType.SPECTATOR);
            sender.sendMessage(new TextComponentString("Gamemode set to SPECTATOR"));
        }
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        if(!OreCraft.config.getBoolean("gm-command-enabled")) return false;
        return OreCraft.config.getStringList("gm-allowed-players").contains(sender.getName().toLowerCase());
    }

    @Override
    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos) {
        return null;
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
