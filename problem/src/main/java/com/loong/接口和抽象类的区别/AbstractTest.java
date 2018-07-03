package com.loong.接口和抽象类的区别;

abstract class Animal {
    public abstract void cry();
}
class Cat extends Animal{

    @Override
    public void cry() {
        System.out.println("猫叫：喵喵...");
    }
}

class Dog extends Animal{

    @Override
    public void cry() {
        System.out.println("狗叫:汪汪...");
    }

}

public class AbstractTest {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();

        a1.cry();
        a2.cry();
    }
}

