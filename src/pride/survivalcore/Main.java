package pride.survivalcore;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.utils.Config;

import pride.survivalcore.EventListener;
import pride.survivalcore.tasks.BroadcastTask;
import pride.survivalcore.tasks.MotdTask;

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
          this.getServer().getScheduler().scheduleRepeatingTask(new BroadcastTask(this), 20*60);
          this.getServer().getScheduler().scheduleRepeatingTask(new MotdTask(this), 20*60);
          
          this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
          
          this.getServer().getNetwork().setSubName(this.title);
     }
}