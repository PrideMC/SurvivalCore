package pride.survivalcore.commands;

import ru.nukkitx.forms.elements.SimpleForm;

import pride.survivalcore.Main;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.utils.TextFormat;

public class RegionCommand extends Command {
    
    private Main plugin;
    
    public RegionCommand(Main plugin){
        super("region", "Transfer another region.", "/region <name>");
        this.plugin = plugin;
    }
    
    public boolean onCommand(CommandSender sender, String label, String[] args){
        if(!(sender instanceof Player)){
            sender.sendMessage(TextFormat.YELLOW + "PrideMC" + TextFormat.BOLD + TextFormat.GRAY + " » " + TextFormat.RESET + TextFormat.RED + "Sorry you can only use this on the game!");
            return true;
        }
        
        this.sendForm((Player(sender)));
    }
}