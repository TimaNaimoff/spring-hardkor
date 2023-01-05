package org.example.application;

import org.example.music_domain.ClassicalMusic;
import org.example.music_domain.Music;
import org.example.music_domain.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[]args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music=context.getBean("musicBean", Music.class);
        Music musicall=context.getBean("musicallBean",Music.class);
        MusicPlayer player=new MusicPlayer(music);
        MusicPlayer player2=new MusicPlayer(musicall);
        player.playMusic();
        player2.playMusic();
        context.close();
    }
}
