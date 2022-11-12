package org.vqiz.dev.period.player;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.track.playback.MutableAudioFrame;
import net.dv8tion.jda.api.audio.AudioSendHandler;
import org.jetbrains.annotations.Nullable;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class AudioPlayerSendHandler implements AudioSendHandler {
    public static AudioPlayer player ;
    public static ByteBuffer buffer = ByteBuffer.allocate(1024);
    public static MutableAudioFrame frame;
    public AudioPlayerSendHandler(AudioPlayer player1){
        player = player1;
        buffer = ByteBuffer.allocate(1024);
        frame = new MutableAudioFrame();
        frame.setBuffer(buffer);
    }
    @Override
    public boolean canProvide() {
        return player.provide(frame);
    }

    @Nullable
    @Override
    public ByteBuffer provide20MsAudio() {
        final Buffer buf = (buffer).flip();
        return null;
    }
    @Override
    public boolean isOpus(){

        return true;
    }
}
