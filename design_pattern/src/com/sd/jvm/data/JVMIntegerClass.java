package com.sd.jvm.data;

public class JVMIntegerClass {
    public static void main(String[] args) {
        /**
         *Byte、Short、Integer、Long、Character、Boolean、String这7种包装类都各自实现了自己的常量池
         * Byte、Short、Integer、Long、Character这5种包装类都默认创建了数值[-128 , 127]的缓存数据。
         * 当对这5个类型的数据不在这个区间内的时候，将会去创建新的对象，并且不会将这些新的对象放入常量池中。
         */
        Integer i1=66;
        Integer i2=66;
        System.out.println("i1==i2:"+(i1==i2));  //true

        Integer i3=127;
        Integer i4=127;
        System.out.println("i3==i4:"+(i3==i4));  //true

        Integer i5=128;
        Integer i6=128;
        System.out.println("i5==i6:"+(i5==i6));  //false

        Integer i7=-128;
        Integer i8=-128;
        System.out.println("i7==i8:"+(i7==i8));  //true

        Integer i9=-129;
        Integer i10=-129;
        System.out.println("i5==i6:"+(i9==i10));  //false
    }
}
