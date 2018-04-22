# 建造者模式
建造者模式：是将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

字面看来非常抽象，实际上它也十分抽象！！！！

建造者模式通常包括下面几个角色：

（1） Builder：给出一个抽象接口，以规范产品对象的各个组成成分的建造。这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建。

（2） ConcreteBuilder：实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。 在建造过程完成后，提供产品的实例。

（3）Director：调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。

（4）Product：要创建的复杂对象。
在游戏开发中建造小人是经常的事了，要求是：小人必须包括头，身体和脚。

下面我们看看如下代码：

Product（要创建的复杂对象。）：

package com.mode.create;
 
public class Person {
 
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
Builder（给出一个抽象接口，以规范产品对象的各个组成成分的建造。这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建。）：

package com.mode.create;
 
public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
ConcreteBuilder（实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。 在建造过程完成后，提供产品的实例。）：

package com.mode.create;
 
public class ManBuilder implements PersonBuilder {
 
    Person person;
 
    public ManBuilder() {
        person = new Person();
    }
 
    public void buildBody() {
        person.setBody("建造男人的身体");
    }
 
    public void buildFoot() {
        person.setFoot("建造男人的脚");
    }
 
    public void buildHead() {
        person.setHead("建造男人的头");
    }
 
    public Person buildPerson() {
        return person;
    }
 
}
Director（调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。）：

package com.mode.create;
 
public class PersonDirector {
    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
测试类：

package com.mode.create;
 
public class Test {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
}