package org.example.music_domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
     private Music music1;
     private Music music2;
     @Value("${musicPlayer.name}")
     private String name;
     @Value("${musicPlayer.value}")
     private int age;
     @Autowired
     public MusicPlayer(@Qualifier("rockMusic")Music music1,
                        @Qualifier("classicalMusic")Music music2){
         this.music1=music1;
         this.music2=music2;
     }
     public MusicPlayer(){}


    public String playMusic2(MusicStyles styles){
        switch(styles){
            case ROCK:
                return music1.getSong()+":"+name+":"+age;
            case CLASSICAL:
                return music2.getSong()+":"+name+":"+age;
            default:
                return null;
        }
     }

    public Music getMusic1() {
        return music1;
    }

    public void setMusic1(Music music1) {
        this.music1 = music1;
    }

    public Music getMusic2() {
        return music2;
    }

    public void setMusic2(Music music2) {
        this.music2 = music2;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

}
enum MusicStyles{
    CLASSICAL,ROCK
        }