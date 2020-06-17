package xyz.gwcr.honran.namutree0345.MagpieBotReboot.commands

import net.dv8tion.jda.api.entities.MessageChannel
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

interface Commandable {
    fun onCommand(content: String, event: MessageReceivedEvent, ch: MessageChannel)
}