package com.scaler.lld.design.assignments.factory;

public abstract class AudioPlayer {
    protected int volume;
    protected double playBackRate;

    public abstract MediaFormat supportsType();

    public abstract void play();

    public abstract void pause();

    public abstract void stop();

    public static class Builder{
        private int volume;
        private double playBackRate;

        public Builder setVolume(int volume){
            this.volume = volume;
            return this;
        }

        public Builder setPlayBackRate(double playBackRate){
            this.playBackRate = playBackRate;
            return this;
        }

        public int getVolume(){
            return this.volume;
        }

        public double getPlayBackRate(){
            return this.playBackRate;
        }

        public Builder build(){
            return new Builder();
        }
    }
}