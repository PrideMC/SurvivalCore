package pride.survivalcore.commands;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.Server;
import cn.nukkit.Player;

import pride.survivalcore.Main;

public class LobbyCommand extends Command {
    
    private Main plugin;
    
    public LobbyCommand(Main plugin){
        super("lobby", "Back to Lobby", "/lobby", new String[]{"hub"});
        this.plugin = plugin;
    }
    
    public boolean execute(CommandSender sender, String label, String[] args){
        if(!(sender instanceof Player)){
            sender.sendMessage(TextFormat.YELLOW + "PrideMC" + TextFormat.BOLD + TextFormat.GRAY + " » " + TextFormat.RESET + TextFormat.RED + "Sorry, you can only use this at the game!");
            return true;
        }

        ((Player)sender).teleport(this.plugin.getServer().getDefaultLevel().getSpawnLocation());
        return true;
    }
}