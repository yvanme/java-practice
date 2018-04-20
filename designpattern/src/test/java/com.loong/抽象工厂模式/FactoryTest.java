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
 在什么情况下应当使用抽象工厂模式
 　　1.一个系统不应当依赖于产品类实例如何被创建、组合和表达的细节，这对于所有形态的工厂模式都是重要的。

 　　2.这个系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。

 　　3.同属于同一个产品族的产品是在一起使用的，这一约束必须在系统的设计中体现出来。（比如：Intel主板必须使用Intel CPU、Intel芯片组）

 　　4.系统提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于实现。
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
