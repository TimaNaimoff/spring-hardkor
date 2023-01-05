package org.example.music_domain;

public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music){
        this.music=music;
    }
    public void playMusic(){
        System.out.println(music.getSong());
    }
}
