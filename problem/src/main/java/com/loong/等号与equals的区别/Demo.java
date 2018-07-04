package com.loong.等号与equals的区别;

public class Demo {
    public static void main(String[] args) {
        /**
         *   ==比较的是两个对象的地址

             equals比较的是两个对象的内容
         */

        String str1=new String("apple");

        String str2=new String("apple");

        System.out.println(str1==str2);

        System.out.println(str1.equals(str2));

    }
}
