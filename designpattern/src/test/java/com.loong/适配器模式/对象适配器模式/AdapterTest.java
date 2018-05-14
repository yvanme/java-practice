package com.loong.适配器模式.对象适配器模式;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-04-25 14:17
 **/

/**
 * 　　对象的适配器模式
 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题。
 */
class Source {
    public void method1() {
        System.out.println("this is original method!");
    }
}

interface Target {

    /* 与原类中的方法相同 */
    public void method1();

    /* 新类的方法 */
    public void method2();
}

class Adapter extends Source implements Target {

    private Source source;

    public Adapter(Source source){
        super();
        this.source = source;
    }

    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}

public class AdapterTest {

    public static void main(String[] args) {
        Source source = new Source();
        Target target = new Adapter(source);
        target.method1();
        target.method2();
    }
}
