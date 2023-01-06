package org.example.application;

import org.example.music_domain.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[]args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
//                MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
//                musicPlayer.playMusic2();
                Computer computer=context.getBean("computer",Computer.class);
                computer.playMusic();
                System.out.println(computer);

        context.close();

    }
}
