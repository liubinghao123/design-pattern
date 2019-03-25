package com.hao.player;

/**
 * Created by Keeper on 2019-03-25
 */
public class MediaAdapterTest {
    public static void main(String[] args){
        AudioMediaPlayer audioMediaPlayer = new AudioMediaPlayer();
        audioMediaPlayer.play();
        audioMediaPlayer.play("vlc");
    }
}
