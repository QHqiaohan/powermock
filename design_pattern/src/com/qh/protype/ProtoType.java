package com.qh.protype;

/**
 * 原型模式就是将一个对象作为原型，使用clone()方法来创建新的实例
 */
public class ProtoType implements Cloneable{

    private String name;
    private Love love;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Love getLove() {
        return love;
    }

    public void setLove(Love love) {
        this.love = love;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ProtoType pro=new ProtoType();
        pro.setName("qiaohan & tenxingman");
        Love love=new Love();
        love.setMerrage("爱情");
        pro.setLove(love);
        try {
            ProtoType protoType= (ProtoType) pro.clone();
            System.out.println(protoType.getName());
            System.out.println(protoType.getLove().getMerrage());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Love implements Cloneable{
    private String merrage;

    public String getMerrage() {
        return merrage;
    }

    public void setMerrage(String merrage) {
        this.merrage = merrage;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }finally {
            return null;
        }
    }
}
