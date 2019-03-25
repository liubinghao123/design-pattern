package com.hao.player;

/**
 * Created by Keeper on 2019-03-25
 */
public class MP4Adapter extends MediaAdapter {
    @Override
    public void play() {
        AdvnaceMediaFactory.getAdanceMedia("mp4").playMP4();
    }
}
