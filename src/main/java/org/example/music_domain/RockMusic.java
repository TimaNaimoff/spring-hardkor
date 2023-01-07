package org.example.music_domain;

import org.example.music_domain.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

//@Component
public class RockMusic implements Music {
    private List<String> list;
    public RockMusic(){
        list=new ArrayList<>();
        list.add("Black Fox");
        list.add("White Pink");
        list.add("Shin ho chuan chiqlun");
    }
    public static RockMusic factoryMethod(){
        return new RockMusic();
    }
     @PostConstruct
     private void doMyInit(){
         System.out.println("Bean initialized!");
     }
     @PreDestroy
     private void doMyDestroy(){
         System.out.println("Doing my destruction!");
     }

      public List<String> getList() {
        return list;
    }

      public void setList(List<String> list) {
        this.list = list;
    }

      @Override
      public String getSong() {
        return list.toString();
    }
}
