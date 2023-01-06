package org.example.music_domain;

public class JazzMusic implements Music{
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
