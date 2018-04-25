package com.loong.代理模式;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-04-25 14:34
 **/
interface Sourceable {
    public void method();
}
class Source implements Sourceable {


    public void method() {
        System.out.println("the original method!");
    }
}
class Proxy implements Sourceable {

    private Source source;
    public Proxy(){
        super();
        this.source = new Source();
    }

    public void method() {
        before();
        source.method();
        atfer();
    }
    private void atfer() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }
}
public class ProxyTest {

    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }

}
