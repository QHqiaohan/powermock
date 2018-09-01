package com.qh.strategy;

/**
 * 针对QuackBehavior的几种具体实现
 */
public class MuteQuackNoWay implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("什么都不叫......");
    }
}
