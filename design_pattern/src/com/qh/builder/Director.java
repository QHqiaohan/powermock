package com.qh.builder;

/**
 * 建造者
 */
public class Director {

    public static Product constructProduct(ConcreteBuilder concreteBuilder){
        concreteBuilder.buildBasic();
        concreteBuilder.buildWalls();
        concreteBuilder.roofed();

        return concreteBuilder.buildProduct();
    }

    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder=new ConcreteBuilder();
        Product product = constructProduct(concreteBuilder);
        System.out.println(product);
    }
}
