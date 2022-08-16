package pride.survivalcore.tasks;

import cn.nukkit.scheduler.PluginTask;
import cn.nukkit.Server;
import cn.nukkit.utils.TextFormat;

import java.util.Random;

import pride.survivalcore.Main;

public class BroadcastTask extends PluginTask<Main> {
     
     public BroadcastTask(Main owner) {
        super(owner);
    }
     
     private String[] messages = {
          TextFormat.YELLOW + "PrideMC" + TextFormat.RESET + TextFormat.BOLD + TextFormat.GRAY + " » " + TextFormat.RESET + TextFormat.RED + "Thanks for playing in our server!",
          TextFormat.YELLOW + "PrideMC" + TextFormat.RESET + TextFormat.BOLD + TextFormat.GRAY + " » " + TextFormat.RESET + TextFormat.GREEN + "Do you found a bug? Report us by using /report",
          TextFormat.YELLOW + "PrideMC" + TextFormat.RESET + TextFormat.BOLD + TextFormat.GRAY + " » " + TextFormat.RESET + TextFormat.GOLD + "Join in our discord server to get latest updates from us!"
     };
     
     private int seq = 0;
     
     @Override
     public void onRun(int currentTick){
          while(true) {
            if (this.seq < 3) {
                this.getOwner().getServer().broadcastMessage(this.messages[this.seq]);
                this.seq++;
                break;
            } else {
                this.seq = 0;
            }
        }
     }
}