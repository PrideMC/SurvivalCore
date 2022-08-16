package PrideMC.SurvivalCore;

import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerQuitEvent;
import cn.nukkit.event.block.BlockBreakEvent;
import cn.nukkit.event.block.BlockPlaceEvent;
import cn.nukkit.event.player.PlayerDropItemEvent;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.Server;
import cn.nukkit.Player;

import PrideMC.SurvivalCore.Main;

public class EventListener implements Listener{
     
     private Main plugin;
     
     public EventListener(Main plugin){
          this.plugin = plugin;
     }
     
     public void onJoin(PlayerJoinEvent event){
          event.setJoinMessage("");
     }
     
     public void onLeave(PlayerQuitEvent event){
          event.setQuitMessage("");
     }
     
     public void onBreak(BlockBreakEvent event){
          if (event.getPlayer().getLevel().getFolderName() == "lobby"){
               event.setCancelled(true);
          }
     }
     
     public void onPlace(BlockPlaceEvent event){
          if (event.getPlayer().getLevel().getFolderName() == "lobby"){
               event.setCancelled(true);
          }
     }
     
     public void onDrop(PlayerDropItemEvent event){
          if (event.getPlayer().getLevel().getFolderName() == "lobby"){
               event.setCancelled(true);
          }
     }
     
     public void onEntityDamage(EntityDamageEvent event){
          if (event.getEntity().getLevel().getFolderName() == "lobby"){
               event.setCancelled(true);
          }
     }
}