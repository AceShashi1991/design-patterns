package com.scaler.lld.design.assignments.abstractfactory;

import com.scaler.lld.design.assignments.abstractfactory.decoder.AudioDecoder;
import com.scaler.lld.design.assignments.abstractfactory.decoder.FLACDecoder;
import com.scaler.lld.design.assignments.abstractfactory.player.AudioPlayer;
import com.scaler.lld.design.assignments.abstractfactory.player.FLACPlayer;
import com.scaler.lld.design.assignments.abstractfactory.processor.AudioProcessor;
import com.scaler.lld.design.assignments.abstractfactory.processor.FLACAudioProcessor;

public class FLACAudioFactory extends AudioFactory {
    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume,double playBackRate) {
        return new FLACPlayer(volume,playBackRate);
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new FLACAudioProcessor(audioData);
    }
}