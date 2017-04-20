package stream.flarebot.flarebot.commands.automod;

import stream.flarebot.flarebot.commands.Command;
import stream.flarebot.flarebot.commands.CommandType;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.entities.User;

public class SetSeverityCommand implements Command {

    @Override
    public void onCommand(User sender, TextChannel channel, Message message, String[] args, Member member) {

    }

    @Override
    public String getCommand() {
        return "setseverity";
    }

    @Override
    public String getDescription() {
        return "Change the severity of an action";
    }

    @Override
    public CommandType getType() {
        return CommandType.MODERATION;
    }

    @Override
    public String[] getAliases() {
        return new String[] {"severity"};
    }
}