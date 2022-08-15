package PrideMC.SurvivalCore;

import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerQuitEvent;
import cn.nukkit.event.block.BlockBreakEvent;
import cn.nukkit.Server;
import cn.nukkit.Player;

import PrideMC.SurvivalCore.Main;

public class EventListener implements Listener{
     
     public void onJoin(PlayerJoinEvent event){
          event.setJoinMessage("");
     }
     
     public void onLeave(PlayerQuitEvent event){
          event.setQuitMessage("");
     }
     
     public void onBreak(BlockBreakEvent event){
          if (event.getPlayer().getWorld().getFolderName() === "lobby"){
               event.setCancelled(true);
          }
     }
     
     public void onPlace(BlockPlaceEvent event){
          if (event.getPlayer().getWorld().getFolderName() === "lobby"){
               event.setCancelled(true);
          }
     }
     
     public void onDrop(PlayerDropItemEvent event){
          if (event.getPlayer().getWorld().getFolderName() === "lobby"){
               event.setCancelled(true);
          }
     }
     
     public void onEntityDamage(EntityDamageEvent event){
          if (event.getEntity().getWorld().getFolderName() == "lobby"){
               event.setCancelled(true);
          }
     }
}