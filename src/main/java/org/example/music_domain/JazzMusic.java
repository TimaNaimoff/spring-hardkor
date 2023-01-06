package org.example.music_domain;


import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
    public JazzMusic(){}
    @Override
    public String getSong() {
        return "Santa-Monico";
    }

    private void doMyInit() {
        System.out.println("Jazz music bean initialized!");
    }

     private void doMyDestroy() {
        System.out.println("Jazz music bean destroyed!");
    }
}
