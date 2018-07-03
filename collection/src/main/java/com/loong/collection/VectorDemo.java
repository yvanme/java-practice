package com.loong.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        test();
        test2();
    }
    public static void test2() {
        Vector v = new Vector();
        v.add("xxxx1");
        v.add("xxxx2");
        v.add("xxxx3");
        v.add("xxxx4");
        v.add("xxxx5");
        v.set(2, "qqq");
        v.remove(2);

        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.indexOf("xxxx1"));
        System.out.println(v.get(3));
        System.out.println(v.contains("xxxx51"));
        v.clear();
        System.out.println(v);

    }
    public static void test() {

        Vector<String> v = new Vector<String>();
        v.add("xxxx1");
        v.add("xxxx2");
        v.add("xxxx3");
        v.add("xxxx4");
        v.add("xxxx5");

        //遍历方式

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        for (String s : v) {
            System.out.println(s);
        }

        Iterator it = v.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        System.out.println(v);

        //枚举器
        Enumeration en = v.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
