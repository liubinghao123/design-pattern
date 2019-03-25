package com.hao.player;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Keeper on 2019-03-25
 */
public class MediaAdapterFactory {
    private static MediaAdapterFactory factory = new MediaAdapterFactory();

    private static final Map<String,MediaAdapter> map = new HashMap<String,MediaAdapter>();

    static{
        map.put("vlc",new VLCAdapter());
        map.put("mp4",new MP4Adapter());

    }

    private MediaAdapterFactory(){}

    public static MediaAdapter getMediaAdapter(String key){
        MediaAdapter m = map.get(key);
        return  m==null ? new MediaAdapter() : m;
    }

}
