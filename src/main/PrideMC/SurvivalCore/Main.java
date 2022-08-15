package PrideMC.SurvivalCore;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.utils.Config;

import PrideMC.SurvivalCore.EventListener;
import PrideMC.SurvivalCore.tasks.BroadcastTask;
import PrideMC.SurvivalCore.tasks.MotdTask;

import java.io.File;
import java.io.IOException;

public class Main extends PluginBase {
     
     
     @Override
     public void onLoad(){
          this.saveResource("config.yml");
     }
     
     @Override
     public void onEnable(){
          this.getScheduler().scheduleRepeatingTask(new BroadcastTask(this), 20*60);
          //this.getScheduler().scheduleRepeatingTask(new MotdTask(this), 20*60);
          
          this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
     }
}