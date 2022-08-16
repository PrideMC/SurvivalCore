package pride.survivalcore.tasks;

import cn.nukkit.scheduler.PluginTask;
import cn.nukkit.Server;
import cn.nukkit.utils.TextFormat;

import pride.survivalcore.Main;

import java.util.Random;

public class MotdTask extends PluginTask<Main> {
    
    public MotdTask(Main owner){
        super(owner);
    }
    
    private String title = TextFormat.YELLOW + "PrideMC" + TextFormat.BOLD + TextFormat.GRAY + " » " + TextFormat.RESET;
    
    private String[] messages = {
        this.title + TextFormat.RED + "Survival Mode!",
        this.title + TextFormat.DARK_RED + "Match & Multiplayer!",
        this.title + TextFormat.YELLOW + "Events!",
    };
    
    private int seq = 0;
    
    @Override
    public void onRun(int currentTick){
         while(true) {
            if (this.seq < 3) {
                this.getOwner().getServer().getNetwork().setName(this.messages[this.seq]);
                this.seq++;
                break;
            } else {
                this.seq = 0;
            }
         }
    }
    
}