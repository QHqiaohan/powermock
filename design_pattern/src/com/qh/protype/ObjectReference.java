package com.qh.protype;

/**
 * clone
 */
public class ObjectReference implements Cloneable{
    Obj obj=new Obj();
    int a=22;

    //修改引用类型
    public void changeStr(Obj obj){
        obj.str="changed value";
    }

    //修改基本类型
    public void changePrimary(int a){
        a=66;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectReference objectReference=new ObjectReference();
        System.out.println("-----------修改引用------------------");
        System.out.println("before call changeStr() method:"+objectReference.obj.getStr());
        objectReference.changeStr(objectReference.obj);
        System.out.println("after call changeStr() method:"+objectReference.obj.getStr());
        System.out.println("---------------修改基本类型----------------------");
        System.out.println("before call changePrimary() method:"+objectReference.a);
        objectReference.changePrimary(objectReference.a);
        System.out.println("after call changePrimary() method:"+objectReference.a);
        System.out.println("=============object.clone() transmit==============");
        System.out.println("before clone:"+objectReference.obj);
        try {
            objectReference.changeStr(((ObjectReference)objectReference.clone()).obj);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("after clone:"+objectReference.obj);

    }
}
class Obj{
    String str="init value";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "str='" + str + '\'' +
                '}';
    }
}
