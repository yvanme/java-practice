package com.loong.写代码使得分别出现StackOverflowError和OutOfMemoryError;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {
    public static void main(String[] args){
        List list=new ArrayList();
        for(;;){
            int[] tmp=new int[1000000];
            list.add(tmp);
        }
    }
}
