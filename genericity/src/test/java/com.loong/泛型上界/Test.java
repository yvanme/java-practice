package com.loong.泛型上界;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-04-23 14:55
 **/
public class Test {
    public static void printIntValue(List<? extends Number> list) {
        for (Number number : list) {
            System.out.print(number.intValue()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<Integer>();
        integerList.add(2);
        integerList.add(2);
        printIntValue(integerList);
        List<Float> floatList=new ArrayList<Float>();
        floatList.add((float) 3.3);
        floatList.add((float) 0.3);
        printIntValue(floatList);
    }
}
