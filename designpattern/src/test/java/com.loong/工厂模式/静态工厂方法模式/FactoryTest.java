package com.loong.工厂模式.静态工厂方法模式;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-04-20 17:45
 *
 **/
interface Sender{
    void sender();
}

class Sms implements Sender {

    public void sender() {
        System.out.println("Sms Send ...");
    }
}

class Mail implements Sender {

    public void sender() {
        System.out.println("Mail Send ...");
    }
}

/**
 *静态工厂方法模式，将多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
 */
class SenderFactory{

    public static Sender produceMail(){
        return new Mail();
    }

    public static Sender produceSms(){
        return new Sms();
    }
}

public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory.produceMail().sender();
    }
}
