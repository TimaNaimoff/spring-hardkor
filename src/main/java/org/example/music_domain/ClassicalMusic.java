package org.example.music_domain;


import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    public ClassicalMusic(){

    }
    public static ClassicalMusic factoryMethod(){
        return new ClassicalMusic();
    }
    @Override
    public String getSong(){
        return "Lacrimosa (Mozart)";
    }


     private void doMyInit() {
        System.out.println("Classical music bean initialized!");
    }

    private void doMyDestroy() {
        System.out.println("ClassicalMusicBean destroyed!");
    }

}
