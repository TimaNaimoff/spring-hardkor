package org.example.application;

import org.example.music_domain.ClassicalMusic;
import org.example.music_domain.Music;
import org.example.music_domain.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[]args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer player=context.getBean("musicPlayer",MusicPlayer.class);
        player.playMusic();

        MusicPlayer player2=context.getBean("musicPlayerSetter",MusicPlayer.class);
        player2.playMusic();
        System.out.println(player2);
        context.close();

    }
}
