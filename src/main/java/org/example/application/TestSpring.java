package org.example.application;

import org.example.music_domain.ClassicalMusic;
import org.example.music_domain.Music;
import org.example.music_domain.MusicPlayer;
import org.example.music_domain.RockMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[]args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        RockMusic music=context.getBean("musicBean", RockMusic.class);
        RockMusic music2=context.getBean("musicBean", RockMusic.class);
        RockMusic music3=context.getBean("musicBean", RockMusic.class);
        RockMusic music4=context.getBean("musicBean", RockMusic.class);
        System.out.println(music.getSong());
        System.out.println(music2.getSong());
        System.out.println(music3.getSong());
        System.out.println(music4.getSong());

        //        MusicPlayer player=context.getBean("musicPlayer",MusicPlayer.class);
//        player.playMusic();
//
//        MusicPlayer player2=context.getBean("musicPlayerSetter",MusicPlayer.class);
//        player2.playMusic();
//        MusicPlayer player3=context.getBean("musicPlayerSetter",MusicPlayer.class);
//        System.out.println(player2+":"+player3);
//        player2.setName("Timur");
//        System.out.println(player2+":"+player3);
//        System.out.println(player3==player2);
        context.close();

    }
}
