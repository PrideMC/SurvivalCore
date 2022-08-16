package pride.survivalcore.tasks;

import cn.nukkit.scheduler.PluginTask;
import cn.nukkit.Server;
import cn.nukkit.utils.TextFormat;

import pride.survivalcore.main;

import java.util.Random;

public class MotdTask extends PluginTask<Main> {
    
    public MotdTask(Main plugin){
        super(plugin);
    }
    
    private String title = TextFormat.YELLOW + "PrideMC" + TextFormat.BOLD + TextFormat.GRAY + " » " + TextFormat.RESET;
    
    private String[] messages = {
        this.title + TextFormat.RED + "Survival Mode!",
        this.title + TextFormat.DARK_RED + "Match & Multiplayer!",
        this.title + TextFormat.YELLOW + "Events!",
    };
    
    @Override
    public void onRun(int currentTick){
         random = new Random().nextInt(messages.length);
          this.getPlugin().getServer().getNetwork().setName(messages[random]);
    }
    
}