package com.scaler.lld.design.assignments.abstractfactory;

import com.scaler.lld.design.assignments.abstractfactory.decoder.AudioDecoder;
import com.scaler.lld.design.assignments.abstractfactory.player.AudioPlayer;
import com.scaler.lld.design.assignments.abstractfactory.processor.AudioProcessor;

public abstract class AudioFactory {
    public abstract MediaFormat supportsFormat();

    public abstract AudioPlayer createAudioPlayer(int volume,double playbackRate);
    public abstract AudioDecoder createAudioDecoder(byte[] audioData);
    public abstract AudioProcessor createAudioProcessor(byte[] audioData);
}