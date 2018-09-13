package com.sd.jvm.data;

public class JVMStringClass {
    public static void main(String[] args) {
        String s1="song dan";
        String s2="song dan";
        System.out.println(s1==s2);  //true

        String s3="song";
        String s4="dan";
        String s5=s3+s4;
        System.out.println(s1==s5);  //false

        String s6="song"+" "+"dan";
        System.out.println(s1==s6);  //true

        String ss1="qiaohan";
        String ss=new String("qiaohan");
        System.out.println(ss==ss1);   //false

        /**
         * 对于使用了new 创建的字符串对象，如果想要将这个对象引用到字符串常量池，可以使用intern() 方法。
         * 调用intern() 方法后，检查字符串常量池中是否有这个对象的引用，并做如下操作：
         * 存在：直接返回对象引用给变量。
         * 不存在：将这个对象引用加入到常量池，再返回对象引用给变量。
         */
        String ss2=ss.intern();
        System.out.println(ss2==ss1);   //true
        System.out.println(ss==ss2);  //false

    }
}
