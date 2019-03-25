package com.hao.player;

/**
 * Created by Keeper on 2019-03-25
 */
public class AudioMediaPlayer implements MediaPlayer {
    public void play() {
        play("");
    }
    public void play(String type){
        MediaAdapter mediaAdapter = MediaAdapterFactory.getMediaAdapter(type);
        mediaAdapter.play();
    }
}
