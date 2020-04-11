package me.ikeldi;

import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.permissions.Permission;

public class Events implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        if(e.getMessage().startsWith("*")){
            StringBuilder msg = new StringBuilder();
            msg.append(ChatColor.RED);
            msg.append("* ");
            msg.append(ChatColor.AQUA);
            msg.append(e.getPlayer().getDisplayName());
            msg.append(" ");
            msg.append(ChatColor.GOLD);
            msg.append(e.getMessage().replace("*", ""));
//            String msg = ChatColor.AQUA + e.getPlayer().getDisplayName() + " " + ChatColor.GOLD + e.getMessage().replace("*", ""); // My old string version :)
            Bukkit.broadcastMessage(msg.toString());
            e.setCancelled(true);
        }
    }

}
