package com.loong.工厂模式.抽象工厂模式;

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
interface Provider {
         public Sender produce();
}
class MailSenderFactory implements Provider{

    public Sender produce() {
        return new Mail();
    }
}
class SmsSenderFactory implements Provider{


    public Sender produce() {
        return new Sms();
    }
}
public class FactoryTest {
    public static void main(String[] args) {
       Provider provider = new SmsSenderFactory();
       Sender sender = provider.produce();
       sender.sender();
    }
}
