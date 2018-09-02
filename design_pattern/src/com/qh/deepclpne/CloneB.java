package com.qh.deepclpne;

public class CloneB implements Cloneable{
    public int aInt;
    public UnCloneA unCloneA=new UnCloneA(111);

    @Override
    public Object clone(){
        CloneB o=null;
        try {
            o= (CloneB) super.clone();
            o.unCloneA= (UnCloneA) unCloneA.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}
