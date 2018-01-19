package co.zpdev.bots.paradoxbot.listeners;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.MessageEmbed;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.hooks.SubscribeEvent;

import java.awt.*;

public class MemberJoin {

    @SubscribeEvent
    public void onJoin(GuildMemberJoinEvent event) {
        TextChannel c = event.getGuild().getTextChannelsByName("welcome", false).get(0);
        String name = event.getUser().getName();

        MessageEmbed embed = new EmbedBuilder()
                .setColor(Color.decode("#36393e"))
                .setAuthor(name + " just joined Paradox Services!", null, event.getUser().getEffectiveAvatarUrl()).build();

        c.sendMessage(embed).queue();
    }

}
