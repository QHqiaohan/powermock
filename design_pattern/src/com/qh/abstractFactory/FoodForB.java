package com.qh.abstractFactory;

public class FoodForB implements Produce{

    @Override
    public Food get() {
        return new FoodB();
    }
}
