package com.nexwise.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class StartProvider {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();
        System.out.println("生产者服务模块启动成功！");
        System.in.read();

    }

}
