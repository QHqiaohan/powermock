package com.chinasoft.asp.util;

import org.junit.jupiter.api.Test;

import java.util.*;

public class MapUtil
{
    @Test
    public void treeMapTest_1()
    {
        /**
         * TreeMap基于红黑树（Red-Black tree）实现
         * 该映射根据其键的自然顺序进行排序，或者根据创建映射时提供的Comparator 进行排序，具体取决于使用的构造方法
         */
        Map<Integer,String> tree=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        tree.put(1,"1");
        tree.put(2,"2");
        System.out.println("tree size:"+tree.size());
        System.out.println("tree.get(1):"+tree.get(1));
        System.out.println("tree.get(2):"+tree.get(2));
    }

    @Test
    public void treeMapTest_2()
    {
        TreeMap<Integer,String> tree=new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return -1;
            }
        });
        tree.put(1,"1");
        tree.put(2,"2");
        System.out.println("tree size:"+tree.size());
        System.out.println("tree.get(1):"+tree.get(1));
        System.out.println("tree.get(2):"+tree.get(2));
    }

    @Test
    public void treeMapTest_3()
    {
        TreeMap<Integer,String> tree=new TreeMap();
        tree.put(1,"1");
        tree.put(2,"2");
        System.out.println("tree size:"+tree.size());
        System.out.println("tree.get(1):"+tree.get(1));
        System.out.println("tree.get(2):"+tree.get(2));
    }

    @Test
    public void treeMapTest_4()
    {
        TreeMap<Integer,String> tree=new TreeMap();
        tree.put(1,"1");
        tree.put(2,"2");
        tree.put(0,"0");
        tree.put(10,"10");
        tree.put(4,"4");
        tree.put(-8,"-8");
        tree.put(55,"55");
        System.out.println("map遍历方式一:entrySet.....................");
        Set<Map.Entry<Integer,String>> entrySet=tree.entrySet();
        System.out.println("for循环----");
        for(Map.Entry<Integer,String> entry:entrySet)
        {
            System.out.println("key:"+entry.getKey()+"  value:"+entry.getValue());
        }
        System.out.println("迭代器------");
        Iterator<Map.Entry<Integer,String>> it=tree.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("key:"+entry.getKey()+"  value:"+entry.getValue());
        }

        System.out.println("map遍历方式二:keySet........................");
        Set<Integer> keySet=tree.keySet();
        for(Integer key:keySet)
        {
            System.out.println("key:"+key+"  value:"+tree.get(key));
        }

        System.out.println("map遍历方式三:values.......................");
        for(String s:tree.values())
        {
            System.out.println("value:"+s);
        }

    }

}
