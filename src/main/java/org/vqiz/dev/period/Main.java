package org.vqiz.dev.period;

import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

public class Main {
    public static ShardManager bot;
    public static Dotenv config;
    public static void main(String[] args) {
        config = Dotenv.load();
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(config.get("Token"));
        builder.setActivity(Activity.listening(config.get("Activity")));
        bot = builder.build();



    }

}