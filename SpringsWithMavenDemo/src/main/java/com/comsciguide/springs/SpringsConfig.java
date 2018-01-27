package com.comsciguide.springs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringsConfig {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = (Coach) context.getBean("myCoach");
        System.out.println();
        myCoach.eat();

    }





}
