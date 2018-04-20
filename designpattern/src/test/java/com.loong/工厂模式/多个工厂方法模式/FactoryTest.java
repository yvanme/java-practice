package com.loong.工厂模式.多个工厂方法模式;

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
 * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，
 * 则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
 */
class SenderFactory{

    public Sender produceMail(){
        return new Mail();
    }

    public Sender produceSms(){
        return new Sms();
    }
}

public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        senderFactory.produceMail().sender();
    }
}
