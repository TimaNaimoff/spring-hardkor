package org.example.application;

import org.example.music_domain.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[]args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        RockMusic music=context.getBean("rockMusic", RockMusic.class);
        RockMusic rockMusic=context.getBean("rockMusic", RockMusic.class);
        JazzMusic jazzMusic=context.getBean("jazzMusic",JazzMusic.class);
        ClassicalMusic classicalMusic=context.getBean("classicalMusic",ClassicalMusic.class);

        MusicPlayer player=new MusicPlayer(music);
        player.playMusic2();

        MusicPlayer jazzMusicPlayer=new MusicPlayer(jazzMusic);
        jazzMusicPlayer.playMusic2();



        context.close();

    }
}
