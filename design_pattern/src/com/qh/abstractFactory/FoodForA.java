package com.qh.abstractFactory;

public class FoodForA implements Produce{

    @Override
    public Food get() {
        return new FoodA();
    }
}
