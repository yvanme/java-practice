package com.loong;

import java.util.Arrays;

/**
 * 值类型和引用类型测试test
 */
public class Test
{
    public static void main(String[] args)
    {
        char a[] = {'b', 'a', 'c'};
        Integer s=3;
        String b = "111";
        f(a,s,b);
        System.out.println(Arrays.toString(a)+"   "+s+"    "+b);
    }

    public static void f(char[] a,Integer s, String b) {
        a[1] = 'c';
        s=4;
        b = "123";
    }
}
