package com.hao.player;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Keeper on 2019-03-25
 */
public class AdvnaceMediaFactory {
    private static AdvnaceMediaFactory factory = new AdvnaceMediaFactory();

    private static final Map<String,AdvanceMediaPlayer> map = new HashMap<String,AdvanceMediaPlayer>();

    static{
        map.put("vlc",new VLCMediaPlayer());
        map.put("mp4",new MP4MediaPlayer());

    }

    private AdvnaceMediaFactory(){}

    public static AdvanceMediaPlayer getAdanceMedia(String key){
        return map.get(key);
    }

}
