package xyz.gwcr.honran.namutree0345.MagpieBotReboot.commands

import net.dv8tion.jda.api.events.message.MessageReceivedEvent

interface Commandable {
    open fun onCommand(
        content: String,
        event:MessageReceivedEvent
    ) {}
}