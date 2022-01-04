package xyz.becvar.discord.botbase.event.events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import xyz.becvar.discord.botbase.config.ConfigManager;
import xyz.becvar.discord.botbase.file.FileSystem;
import xyz.becvar.discord.botbase.utils.Logger;
import xyz.becvar.discord.botbase.utils.MysqlUtils;

/*
 * The msg logger
 * Function: log all msg on server to txt file
*/

public class UserMessageLogger extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        //Block log for bot account
        if (event.getAuthor().isBot()) {
            return;
        }

        //Get log data
        String author = event.getAuthor().getName();
        String msg = event.getMessage().getContentRaw();
        String channel = event.getChannel().getName();

        //Log only if msg not empty
        if (!event.getMessage().getContentRaw().isEmpty()) {

            //Save log to file
            if (ConfigManager.instance.isMysqlLoggingEnabled()) {
                MysqlUtils.logMSG(author, channel, msg);
            } else {
                FileSystem.saveMessageLog(author + "[" + channel + "] : " + msg);
            }

            //Print log to app console
            Logger.INSTANCE.logToConsole(author + "[" + channel + "] : " + msg);
        }
    }
}
