package com.loong.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArraryListDemo {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("e");
        stringList.add("f");
        stringList.add("g");
        stringList.add("g");
        System.out.println("-------------------第一种遍历方式---------------------------");
        for (String str:stringList) {
            System.out.println(str);
        }
        System.out.println("-------------------第二种遍历方式---------------------------");
        ListIterator<String> it = stringList.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
