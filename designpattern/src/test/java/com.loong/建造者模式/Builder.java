package com.loong.建造者模式;

import java.util.ArrayList;
import java.util.List;
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
class MailSenderFactory implements Provider {

    public Sender produce() {
        return new Mail();
    }
}
class SmsSenderFactory implements Provider {


    public Sender produce() {
        return new Sms();
    }
}
public class Builder {
    private List<Sender> senders = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
         senders.add(new Mail());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
         senders.add(new Sms());

        }
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
