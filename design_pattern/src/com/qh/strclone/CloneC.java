package com.qh.strclone;

public class CloneC implements Cloneable {
    public String str;
    public StringBuffer strBuff;

    @Override
    public Object clone() throws CloneNotSupportedException {
        CloneC c=null;
        c= (CloneC) super.clone();
        //实现StringBuffer的深克隆
        /**
         *
         */
        c.strBuff=new StringBuffer(c.strBuff.toString());
        return c;
    }
}
