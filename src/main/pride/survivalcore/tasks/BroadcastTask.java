package pride.survivalcore.tasks;

import cn.nukkit.scheduler.PluginTask;
import cn.nukkit.Server;
import cn.nukkit.utils.TextFormat;

import java.util.Random;

public class BroadcastTask extends PluginTask<Main> {
     
     public BroadcastTask(Main plugin) {
        super(plugin);
    }
     
     private String[] messages = {
          TextFormat.YELLOW + "PrideMC" + TextFormat.RESET + TextFormat.BOLD + TextFormat.GRAY + " » " + TextFormat.RESET + TextFormat.RED + "Thanks for playing in our server!",
          TextFormat.YELLOW + "PrideMC" + TextFormat.RESET + TextFormat.BOLD + TextFormat.GRAY + " » " + TextFormat.RESET + TextFormat.GREEN + "Do you found a bug? Report us by using /report",
          TextFormat.YELLOW + "PrideMC" + TextFormat.RESET + TextFormat.BOLD + TextFormat.GRAY + " » " + TextFormat.RESET + TextFormat.GOLD + "Join in our discord server to get latest updates from us!"
     };
     
     @Override
     public void onRun(int currentTick){
          int random = new Random().nextInt(messages.length);
          this.getPlugin().getServer().broadcastMessage(messages[random]);
     }
}