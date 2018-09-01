package com.qh.strategy;

public abstract class Duck {

    public Duck(){

    }

    FlyBehavior flyBehavior;//接口

    QuackBehavior quackBehavior;//接口

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void swim(){
        System.out.println("游泳......");
    }

    /**
     * 由于是接口,会根据继承类实现的方式,而调用相应的方法
     */
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

}
