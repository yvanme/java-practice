package com.loong.自定义注解例二;

import java.util.List;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-04-23 16:01
 **/
public class TestAnnotation {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        Parent c = new Child();
        List<SortableField> list = c.init();//获取泛型中类里面的注解
        //输出结果
        for(SortableField l : list){
            System.out.println("字段名称："+l.getName()+"\t字段类型："+l.getType()+
                    "\t注解名称："+l.getMeta().name()+"\t注解描述："+l.getMeta().description());
        }
    }
}
