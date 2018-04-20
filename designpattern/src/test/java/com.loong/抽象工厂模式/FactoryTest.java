package com.loong.抽象工厂模式;

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
 *抽象工厂模式，这个模式的好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！
 */
interface Provider{
    Sender produce();
}
class SmsSenderFactory implements Provider{

    public Sender produce() {
        return new Sms();
    }
}
class MailSenderFactory implements Provider{
    public Sender produce() {
        return new Mail();
    }
}
public class FactoryTest {
    public static void main(String[] args) {
        Provider provider = new SmsSenderFactory();
        Sender sender = provider.produce();
        sender.sender();
    }
}
