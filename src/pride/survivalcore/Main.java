package pride.survivalcore;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.utils.Config;

import pride.survivalcore.EventListener;
import pride.survivalcore.tasks.BroadcastTask;
import pride.survivalcore.tasks.MotdTask;
import pride.survivalcore.commands.LobbyCommand;

import java.io.File;
import java.io.IOException;

public class Main extends PluginBase {
     
     private String title = TextFormat.YELLOW + "PrideMC Network" + TextFormat.RESET;
     
     
     @Override
     public void onLoad(){
          this.saveResource("config.yml");
     }
     
     @Override
     public void onEnable(){
          this.registerEvents();
          this.registerCommands();
          this.loadTasks();
     }
     
     private void registerCommands(){
         /**
          * Register all commands.
          */
        this.getServer().getCommandMap().register("PrideMC", new LobbyCommand(this));
        /**
         * Un-register the non-usefull commands
         */
         
         this.getServer().getCommandMap().getCommands().remove("about");
         this.getServer().getCommandMap().getCommands().remove("version");
         this.getServer().getCommandMap().getCommands().remove("debugpaste");
         this.getServer().getCommandMap().getCommands().remove("setworldspawn");
         this.getServer().getCommandMap().getCommands().remove("seed");
         this.getServer().getCommandMap().getCommands().remove("version");
         this.getServer().getCommandMap().getCommands().remove("reload"); // This is commonly know as laggy command.
         this.getServer().getCommandMap().getCommands().remove("spawnpoint");
         this.getServer().getCommandMap().getCommands().remove("tell");
         this.getServer().getCommandMap().getCommands().remove("me");
         this.getServer().getCommandMap().getCommands().remove("say");
         this.getServer().getCommandMap().getCommands().remove("xp");
     }
     
     private void loadTasks(){
         this.getServer().getScheduler().scheduleRepeatingTask(new BroadcastTask(this), 20*60);
          this.getServer().getScheduler().scheduleRepeatingTask(new MotdTask(this), 20*60);
     }
     
     private void registerEvents(){
         this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
     }
}