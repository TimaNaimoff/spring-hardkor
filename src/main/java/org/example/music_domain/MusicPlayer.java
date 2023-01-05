package org.example.music_domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> list=new ArrayList<>();
    private String name;
    private int value;
    //IoC
    public MusicPlayer(Music music1,Music music2,Music music3){
        list.add(music1);
        list.add(music2);
        list.add(music3);
    }
    public MusicPlayer(){}
    public void playMusic(){
       list.forEach(e->{
           System.out.println(e.getSong());
       });
    }

    public void setList(Music...music) {
        list.addAll(Arrays.asList(music));
    }

    public List<Music> getList() {
        return list;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setList(List<Music> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "list=" + list +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
