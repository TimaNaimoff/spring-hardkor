package org.example.music_domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private Long id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer){
        this.musicPlayer=musicPlayer;
        this.id=1L;
    }
    public void playMusic(){
        int counter= (int) (Math.random() * 1);
        System.out.println(counter);
        System.out.println(musicPlayer.playMusic2(counter==0?MusicStyles.CLASSICAL:
                MusicStyles.ROCK));
    }
    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }


}
