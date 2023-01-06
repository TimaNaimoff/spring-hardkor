package org.example.music_domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
//    private Music music;
    private ClassicalMusic classicalMusic;
    private JazzMusic jazzMusic;
    private String name;
    private int value;

     public MusicPlayer(){}

    //Dependency-injection with annotations
//    @Autowired
//    public MusicPlayer(Music music){
//        this.music = music;
//    }
    @Autowired
    public MusicPlayer(JazzMusic jazzMusic,ClassicalMusic classicalMusic){
         this.jazzMusic=jazzMusic;
         this.classicalMusic=classicalMusic;
    }


    public String playMusic2(){
        return jazzMusic.getSong()+" "+classicalMusic.getSong();
    }

//    public Music getMusic() {
//        return music;
//    }
//    public void setMusic(Music music) {
//        this.music = music;
//    }


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
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
