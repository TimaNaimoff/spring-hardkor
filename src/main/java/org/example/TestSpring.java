package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[]args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean firstBean=context.getBean("testBean",TestBean.class);
        System.out.println(firstBean.getName());
        context.close();
    }
}
