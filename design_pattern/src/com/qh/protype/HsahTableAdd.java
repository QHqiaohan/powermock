package com.qh.protype;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

/**
 * Hashtable真的能存储对象吗？
 * 看一看下面的很简单的代码，先是声明了一个Hashtable和StringBuffer对象，
 * 然后分四次把StriingBuffer对象放入到Hashtable表中，
 * 在每次放入之前都对这个StringBuffer对象append()了一些新的字符串
 *
 * https://www.cnblogs.com/felixzh/p/6021886.html
 */
public class HsahTableAdd {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        List list=new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        sb.append("abc,");
        ht.put("1", sb);
        list.add(sb);
        sb.append("def,");
        ht.put("2", sb);
        list.add(sb);
        sb.append("mno,");
        ht.put("3", sb);
        list.add(sb);
        sb.append("xyz.");
        ht.put("4", sb);
        list.add(sb);

        int numObj = 0;
        Enumeration it = ht.elements();
        while (it.hasMoreElements()) {
            System.out.print("get StringBufffer " + (++numObj) + " from Hashtable: ");
            System.out.println(it.nextElement());
        }
        System.out.println("--------------------------");
        for(Object obj:list){
            System.out.println(obj);
        }
    }
}
