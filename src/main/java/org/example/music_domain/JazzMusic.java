package org.example.music_domain;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class JazzMusic implements Music{
    public JazzMusic(){}
    @Override
    public String getSong() {
        return "Santa-Monico";
    }
    @PostConstruct
    private void doMyInit() {
        System.out.println("Jazz music bean initialized!");
    }
     @PreDestroy
     private void doMyDestroy() {
        System.out.println("Jazz music bean destroyed!");
    }
}
