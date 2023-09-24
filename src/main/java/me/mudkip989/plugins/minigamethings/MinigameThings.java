package me.mudkip989.plugins.minigamethings;

import org.bukkit.plugin.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.desktop.*;
import java.util.logging.*;

public final class MinigameThings extends JavaPlugin {

    private static Plugin instance;

    public static Logger log = Logger.getLogger("Minigame.exe");

    @Override
    public void onEnable() {
        instance = this;
        log.info( "Getting config...");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
