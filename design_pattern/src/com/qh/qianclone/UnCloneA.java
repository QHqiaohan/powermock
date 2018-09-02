package com.qh.qianclone;

public class UnCloneA {
    private int i;

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
}
