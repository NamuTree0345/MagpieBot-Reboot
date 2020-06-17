package xyz.gwcr.honran.namutree0345.MagpieBotReboot

import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import xyz.gwcr.honran.namutree0345.MagpieBotReboot.commands.Command
import xyz.gwcr.honran.namutree0345.MagpieBotReboot.commands.Commandable
import xyz.gwcr.honran.namutree0345.MagpieBotReboot.commands.GGaK
import kotlin.reflect.typeOf

class Listener(api: JDA) : ListenerAdapter() {

    val prefix1 = "깎!"
    val prefix2 = "깍!"
    var commandList = arrayOf(GGaK())

    override fun onMessageReceived(event: MessageReceivedEvent) {
        for(cmd in commandList) {
            println(cmd.cmdName)
            if(event.message.contentRaw.startsWith(prefix1 + cmd.cmdName) || event.message.contentRaw.startsWith(prefix1 + cmd.cmdName))
            {
                //val comm: Commandable = cmd as Commandable
                //comm.onCommand(event.message.contentRaw, event, event.channel )
                cmd.onCommand(event.message.contentRaw, event, event.channel)
            }
        }
    }
}