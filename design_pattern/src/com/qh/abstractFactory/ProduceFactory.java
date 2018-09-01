package com.qh.abstractFactory;

public class ProduceFactory {

    static Food f=null;

    public static void produceA(){
        f=new FoodForA().get();
    }

    public static void produceB(){
        f=new FoodForB().get();
    }

    public static void main(String[] args) {
        produceA();
        produceB();
    }
}
