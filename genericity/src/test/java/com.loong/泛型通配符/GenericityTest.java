package com.loong.泛型通配符;

import com.loong.泛型类.Generic;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-04-23 14:43
 **/
//定义一个泛型接口


public class GenericityTest {
    public void showKeyValue1(Generic<?> obj){
        System.out.println("泛型测试,key value is " + obj.getKey());
    }
}
