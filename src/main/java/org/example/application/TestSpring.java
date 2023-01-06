package org.example.application;

import org.example.music_domain.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[]args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
//                Computer computer=context.getBean("computer",Computer.class);
//                computer.playMusic();
        ClassicalMusic musiker=context.getBean("classicalMusic",ClassicalMusic.class);
        ClassicalMusic musiker2=context.getBean("classicalMusic",ClassicalMusic.class);
        System.out.println(musiker==musiker2);
//        RockMusic music=context.getBean("rockMusic",RockMusic.class);
        context.close();

    }
}
