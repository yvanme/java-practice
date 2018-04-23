package com.loong.自定义注解例三;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-04-23 16:17
 **/
import javafx.scene.control.Tab;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * Created by Tanyunlong on 2016/12/3.
 */
public class Test {

    public static void main(String[] args){
        Filter f1=new Filter();
        f1.setId(10);
        Filter f2=new Filter();
        f2.setUserName("tet");
        Filter f3=new Filter();
        f3.setEmail("test@163.com");

        String sql1=query(f1);
        String sql2=query(f1);
        String sql3=query(f1);

    }
    public static String query(Filter filter){
        StringBuffer sb=new StringBuffer();
        //1.获取到Class
        Class c= filter.getClass();
        //2.获取到table的名字
        boolean exists= c.isAnnotationPresent(Table.class);
        if (!exists){
            return null;
        }
        Table t=(Table)c.getAnnotation(Table.class);
        String tableName=  t.value();
        sb.append("select * from ").append(tableName).append(" where 1=1");
        //3.遍历所有字段
        Field[] fArray=c.getDeclaredFields();
        for (Field field:fArray){
            /**
             * 4.处理每个字段对应的sql
             * 拿到字段名 字段值 拼装sql
             */
            boolean fExists=field.isAnnotationPresent(Column.class);
            if (!fExists){
                continue;
            }
            Column column= field.getAnnotation(Column.class);
            String columnName=column.value();//字段名
            String fieldName=field.getName();
            String getMethodName="get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
            Object fieldValue=null;
            try {
                Method getMethod=c.getMethod(getMethodName);
                fieldValue=getMethod.invoke(filter);//字段值
            } catch (Exception e) {
                e.printStackTrace();
            }
            //拼装sql
            if (fieldValue==null||(fieldValue instanceof Integer&&(Integer)fieldValue==0)){
                continue;
            }
            sb.append("and").append(field).append("=").append(fieldValue);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
