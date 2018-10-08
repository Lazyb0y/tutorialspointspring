package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        World world = (World) context.getBean("world");
        world.getLanguage();
        world.getGreetings();

        Bangladesh bangladesh = (Bangladesh) context.getBean("bangladesh");
        bangladesh.getLanguage();
        bangladesh.getGreetings();
        bangladesh.getPrimaryLanguage();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
