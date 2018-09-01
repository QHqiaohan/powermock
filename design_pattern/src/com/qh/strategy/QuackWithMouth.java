package com.qh.strategy;

/**
 * 针对QuackBehavior的几种具体实现
 */
public class QuackWithMouth implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("用嘴呱呱叫......");
    }
}
