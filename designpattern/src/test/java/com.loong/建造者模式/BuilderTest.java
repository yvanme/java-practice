package com.loong.建造者模式;

class Person{
    private String head;
    private String body;
    private String foot;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }
}
interface PersonBuilder{
    void buildHead();
    void buildBody();
    void buildFoot();
}
class PersonBuilderImpl implements PersonBuilder{

    Person person;

    public PersonBuilderImpl() {
        person = new Person();
    }
    public void buildHead() {
        System.out.println("组合头");
        person.setHead("组合头");
    }

    public void buildBody() {
        System.out.println("组合身体");
        person.setBody("组合身体");
    }

    public void buildFoot() {
        System.out.println("组合脚");
        person.setFoot("组合脚");
    }
    public Person buildPerson() {
        return person;
    }
}
class Worker{
    public Person constructPerson(PersonBuilderImpl pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
public class BuilderTest {
    public static void main(String[] args) {
        Worker pd = new Worker();
        Person person = pd.constructPerson(new PersonBuilderImpl());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
}
