package xyz.gwcr.honran.namutree0345.MagpieBotReboot

import net.dv8tion.jda.api.*
import net.dv8tion.jda.api.entities.Activity
import java.io.File

fun main() {
    var builder: JDABuilder = JDABuilder(File("./token.txt").readText())
    val api: JDA = builder.build()
    api.presence.activity = Activity.playing("👑 까치봇 부활!")
}