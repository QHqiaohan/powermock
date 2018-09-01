package com.qh.strategy;

public class WhiteFlyDuck extends Duck {

    public WhiteFlyDuck(){
        flyBehavior=new FlyWithWings();
        quackBehavior=new QuackWithMouth();

        flyBehavior.fly();
        quackBehavior.quack();
    }

    @Override
    public void display() {
        System.out.println("白天鹅......");
    }

    public static void main(String[] args) {
        new WhiteFlyDuck();
    }
}
