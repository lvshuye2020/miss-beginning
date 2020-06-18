package com.miss.zuichu.task;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MyTask {
    public static Random random = new Random();
    public void doTestOne(){
        long start = System.currentTimeMillis();

    }
}
