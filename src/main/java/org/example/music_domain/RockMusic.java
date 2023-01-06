package org.example.music_domain;

import org.example.music_domain.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class RockMusic implements Music {
    public RockMusic(){}
    public static RockMusic factoryMethod(){
        return new RockMusic();
    }

     private void doMyInit(){
         System.out.println("Bean initialized!");
     }
     private void doMyDestroy(){
         System.out.println("Doing my destruction!");
     }
      @Override
      public String getSong() {
        return "Wind cries Marry";
    }
}
