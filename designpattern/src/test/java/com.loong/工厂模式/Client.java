package com.loong.工厂模式;

import org.junit.Test;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-04-20 17:06
 **/
interface Car{}

class A implements Car{}

class B implements Car{}

/**
 * 静态工厂
 * 常用的工厂模式是静态工厂，利用static方法，作为一种类似于常见的工具类Utils等辅助效果，一般情况下工厂类不需要实例化
 */
class StaticFactory{

    private StaticFactory(){};

    public static Car getA(){
        return new A();
    }
    public static Car getB(){
        return new B();
    }
}

public class Client {

    //客户端代码只需要将相应的参数传入即可得到对象
    //用户不需要了解工厂类内部的逻辑。
    @Test
    public void testClient() {
        Car carA = getCar("A");
        System.out.println(carA.getClass().getName());
        Car carB = getCar("B");
        System.out.println(carB.getClass().getName());
    }

    public Car getCar(String car){
      if(car.equals("A")){
        return StaticFactory.getA();
      } else {
          return StaticFactory.getB();
      }
    }
}
