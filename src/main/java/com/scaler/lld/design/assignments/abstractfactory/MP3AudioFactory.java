package com.scaler.lld.design.assignments.abstractfactory;

import com.scaler.lld.design.assignments.abstractfactory.decoder.AudioDecoder;
import com.scaler.lld.design.assignments.abstractfactory.decoder.MP3Decoder;
import com.scaler.lld.design.assignments.abstractfactory.player.AudioPlayer;
import com.scaler.lld.design.assignments.abstractfactory.player.MP3Player;
import com.scaler.lld.design.assignments.abstractfactory.processor.AudioProcessor;
import com.scaler.lld.design.assignments.abstractfactory.processor.MP3AudioProcessor;

public class MP3AudioFactory extends AudioFactory{

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new MP3Player(volume,playbackRate);
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new MP3AudioProcessor(audioData);
    }
}