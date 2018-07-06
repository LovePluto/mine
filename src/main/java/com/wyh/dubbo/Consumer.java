package com.wyh.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); //Obtaining a remote service proxy
        String hello = demoService.sayHello("world"); // Executing remote methods
        System.out.println(hello); // Display the call result
    }
}
