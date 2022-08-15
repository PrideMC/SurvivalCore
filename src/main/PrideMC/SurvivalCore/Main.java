package PrideMC.SurvivalCore;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.utils.Config;

import java.io.File;
import java.io.IOException;

public class Main extends PluginBase {
     @Override
     public void onLoad(){
          this.getLogger().info(TextFormat.GREEN + "PrideMC Survival Core");
     }
     
     public void onEnable(){
     }
}