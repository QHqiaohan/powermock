package com.qh.strategy;

/**
 * 具体飞行行为
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("用翅膀飞翔......");
    }
}
