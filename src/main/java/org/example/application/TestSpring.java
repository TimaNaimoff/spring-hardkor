package org.example.application;

import org.example.config.SpringConfig;
import org.example.music_domain.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[]args){
//        ClassPathXmlApplicationContext context=
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//                Computer computer=context.getBean("computer",Computer.class);
//                computer.playMusic();
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Computer computer=context.getBean(Computer.class);
        computer.playMusic();
//        RockMusic music=context.getBean("rockMusic",RockMusic.class);
        context.close();

    }
}
