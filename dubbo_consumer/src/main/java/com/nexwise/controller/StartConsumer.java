package com.nexwise.controller;

import com.nexwise.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartConsumer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        System.out.println("消费服务模块启动成功！");
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("xiaoming");
        System.out.println(hello);
        System.out.println("接口消费成功！");
    }

}
