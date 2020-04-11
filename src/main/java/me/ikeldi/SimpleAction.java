package me.ikeldi;

import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleAction extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
