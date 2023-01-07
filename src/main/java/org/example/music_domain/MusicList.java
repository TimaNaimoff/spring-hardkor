package org.example.music_domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicList {
    private List<Music> list;
    public MusicList(Music...music){
         list=new ArrayList<>();
         list.addAll(Arrays.asList(music));
    }
    public List<Music>getList(){
        return list;
    }
}
