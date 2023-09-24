package me.mudkip989.plugins.minigamethings.Commands;

import org.bukkit.command.*;
import org.bukkit.entity.*;

public class Tag implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {


        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
        }


        return false;
    }

}
