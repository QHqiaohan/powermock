package com.qh.deepclpne;

public class UnCloneA implements Cloneable{
    private int i;
    private StringBuffer sb;

    public UnCloneA() {
    }

    public UnCloneA(int i) {
        this.i = i;
    }
    public void doublevalue() {
        i *= 2;
    }
    public String toString(){
        return Integer.toString(i);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
