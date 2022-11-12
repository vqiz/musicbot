package org.vqiz.dev.period.player;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.player.AudioPlayerManager;

public class GuildMusicManager {
    public static AudioPlayer player;
    public static TrackScheduler scheduler;
    public static AudioPlayerSendHandler sendHandler;

    public GuildMusicManager(AudioPlayerManager manager){
        player = manager.createPlayer();
        scheduler = new TrackScheduler(player);
        player.addListener(scheduler);

    }
}
