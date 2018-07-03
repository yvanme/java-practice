package com.loong.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main1(String[] args) {
        LinkedList list = new LinkedList();
        list.add("xxx1");
        list.add("xxx2");
        list.add("xxx3");
        list.add("xxx4");
        list.add("xxx5");
        list.set(2, "qqqq");
        list.remove(2);
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(3));
        System.out.println(list.indexOf("xxx2"));
        System.out.println(list.contains("xxx2"));

    }


    public static void main2(String[] args) {
        //LinkedListlist=new LinkedList();
        ArrayList list = new ArrayList();
        list.add("xxx1");
        list.add("xxx2");
        list.add("xxx3");
        list.add("xxx4");
        list.add("xxx5");
        //测试简单操作100W条数据所需的时间(可与LinkedList比较 )
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(1, "new" + i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }


    public static void main3(String[] args) {
        LinkedList list = new LinkedList();
        //倒着往里压入
        list.push("xxx1");
        list.push("xxx2");
        list.push("xxx3");
        list.push("xxx4");
        list.push("xxx5");
        list.addFirst("大头");
        list.addLast("尾巴");
        list.push("xx6");

        //移除头节点
        list.pop();
        list.pop();
        System.out.println(list);
    }


    public static void main(String[] args) {
        LinkedList list;
        list = new LinkedList();
        list.push("xxx1");
        list.push("xxx2");
        list.push("xxx3");
        list.push("xxx4");
        list.push("xxx5");

        while (list.size() != 0) {
            System.out.println(list.pop());

        }

    }
}
