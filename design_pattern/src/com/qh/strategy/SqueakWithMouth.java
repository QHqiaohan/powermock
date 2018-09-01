package com.qh.strategy;

/**
 * 针对QuackBehavior的几种具体实现
 */
public class SqueakWithMouth implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("用嘴吱吱叫......");
    }
}
