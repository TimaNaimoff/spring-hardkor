package org.example.music_domain;

import org.example.music_domain.Music;

public class RockMusic implements Music {
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
