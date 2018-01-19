package co.zpdev.bots.paradoxbot;

import co.zpdev.bots.paradoxbot.listeners.MemberJoin;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.hooks.AnnotatedEventManager;

public class Paradox {

    public static void main(String[] args) throws Exception {

        new JDABuilder(AccountType.BOT).setToken(args[0])
                .setEventManager(new AnnotatedEventManager())
                .addEventListener(new MemberJoin()).buildBlocking();
    }

}
