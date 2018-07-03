package com.loong.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        //添加
        map.put("a1", 123);
        map.put("a2", "中");
        map.put("a3", 'A');
        map.put("a3", 'B');//新值会覆盖旧值
        map.put("a4", true);
        //允许null键null值
        map.put("a5", null);
        map.put(null, 666);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("a1"));

        //移除
        map.remove("a2");
        map.clear();//全清
        System.out.println(map);

        //遍历
        //1、通过keyset()方法获取所有的key,再通过key去获取value;
        Set keys = map.keySet();
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println("key----->" + key);
            System.out.println("value--->" + map.get(key));
            System.out.println("---------");
        }

        //2、增强for循环keyset();
        Set keys1 = map.keySet();
        for (Object k : keys1) {
            System.out.println("key----->" + k);
            System.out.println("value--->" + map.get(k));
            System.out.println("#########");
        }

//        //3、通过Entry(相当于一层外壳)获取封装好的key和value
//        Set entrys = map.entrySet();
//        Iterator it1 = entrys.iterator();
//        while (it1.hasNext()) {
//            Map.Entry en = it1.next();
//            System.out.println("key----->" + en.getKey());
//            System.out.println("value--->" + en.getValue());
//            System.out.println("=========");
//        }
//
//        //4、增强for循环Entry
//        Set> entrys1 = map.entrySet();
//        for (Map.Entry e : entrys1) {
//            System.out.println("key----->" + e.getKey());
//            System.out.println("value--->" + e.getValue());
//            System.out.println("+++++++++");
//        }
    }
}
