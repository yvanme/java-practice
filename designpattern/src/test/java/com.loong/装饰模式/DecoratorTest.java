package com.loong.装饰模式;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-04-25 14:31
 **/

/**
 * Source类是被装饰类，Decorator类是一个装饰类，可以为Source类动态的添加一些功能
 */
interface Sourceable {
    public void method();
}
class Source implements Sourceable {


    public void method() {
        System.out.println("the original method!");
    }
}
class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }

    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
public class DecoratorTest {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
