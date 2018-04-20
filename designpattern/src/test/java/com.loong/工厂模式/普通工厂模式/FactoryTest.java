package com.loong.工厂模式.普通工厂模式;

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

class Sms implements Sender{

    public void sender() {
        System.out.println("Sms Send ...");
    }
}

class Mail implements Sender{

    public void sender() {
        System.out.println("Mail Send ...");
    }
}

/**
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 */
class SenderFactory{

    public Sender produce(String type){
        if(type.equals("Sms")){
            return new Sms();
        }else if(type.equals("Mail")){
            return new Mail();
        }else {
            System.out.println("Please enter the correct type ...");
            return null;
        }
    }
}
public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        senderFactory.produce("Mail").sender();
    }
}
