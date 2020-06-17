package xyz.gwcr.honran.namutree0345.MagpieBotReboot.commands

import net.dv8tion.jda.api.entities.MessageChannel
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import xyz.gwcr.honran.namutree0345.MagpieBotReboot.sendmsg

class GGaK : Command(),Commandable {
    override var cmdName: String
        get() = "깎"
        set(value) {}
    override var cmdDesc: String
        get() = "깎?!"
        set(value) {}

    override fun onCommand(content: String, event: MessageReceivedEvent, ch: MessageChannel) {
        sendmsg(ch, "깎!!@!#@#!@#!@#@!#!@#!@#")
    }
}