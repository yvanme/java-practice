package com.loong.泛型下界;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-04-23 14:56
 **/
public class Test {
    public static void fillNumberList(List<? super Number> list) {
        list.add(new Integer(0));
        list.add(new Float(1.0));
    }
    public static void main(String[] args) {
        List<? super Number> list=new ArrayList();
        list.add(new Integer(1));
        list.add(new Float(1.1));
    }
}
