package com.qh.builder;

/**
 * 具体建造
 */
public class ConcreteBuilder implements Builder{

    private Product product;

    public ConcreteBuilder(){
        product=new Product();
    }

    @Override
    public void buildBasic() {
        product.setBasic("打好基础");
    }

    @Override
    public void buildWalls() {
        product.setWall("砌墙");
    }

    @Override
    public void roofed() {
        product.setRoofed("盖屋顶");
    }

    //建房子
    @Override
    public Product buildProduct() {
        return product;
    }
}
