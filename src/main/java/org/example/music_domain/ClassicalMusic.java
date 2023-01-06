package org.example.music_domain;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
//@Scope("prototype")
public class ClassicalMusic implements Music{
    private List<String> list;
    public ClassicalMusic(){
       list=new ArrayList<>();
       list.add("Volcano");
       list.add("Muchacho");
       list.add("Bergamonte");
    }
    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public static ClassicalMusic factoryMethod(){
        return new ClassicalMusic();
    }
    @Override
    public String getSong(){
        return list.toString();
    }
     @PostConstruct
     private void doMyInit() {
        System.out.println("Classical music bean initialized!");
    }
    @PreDestroy
    private void doMyDestroy() {
        System.out.println("ClassicalMusicBean destroyed!");
    }

}
