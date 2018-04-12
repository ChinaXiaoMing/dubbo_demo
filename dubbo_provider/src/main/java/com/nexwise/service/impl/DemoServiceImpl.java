package com.nexwise.service.impl;

import com.nexwise.service.DemoService;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
