package com.scaler.lld.design.assignments.factory;

public class AudioPlayerFactory {
    public static AudioPlayer createAudioPlayer(MediaFormat mediaFormat,AudioPlayer.Builder builder){

        switch (mediaFormat){
            case FLAC -> {
                return new FLACPlayer(builder.getVolume(),builder.getPlayBackRate());
            }
            case MP3 -> {
                return new MP3Player(builder.getVolume(),builder.getPlayBackRate());
            }
            case WAV -> {
                return new WAVPlayer(builder.getVolume(),builder.getPlayBackRate());
            }
        }

        throw new IllegalArgumentException("Invalid type: " + mediaFormat.name());
    }
}