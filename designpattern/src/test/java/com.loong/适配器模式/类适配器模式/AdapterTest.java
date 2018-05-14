package com.loong.适配器模式.类适配器模式;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-04-25 14:17
 **/

/**
 * 　　类适配器模式所涉及的角色有：

 　　●　　目标(Target)角色：这就是所期待得到的接口。注意：由于这里讨论的是类适配器模式，因此目标不可以是类。

 　　●　　源(Source)角色：现在需要适配的接口。

 　　●　　适配器(Adaper)角色：适配器类是本模式的核心。适配器把源接口转换成目标接口。显然，这一角色不可以是接口，而必须是具体类。
 */
class Source {
    public void method1() {
        System.out.println("this is original method!");
    }
}

interface Target {

    /* 与原类中的方法相同 */
    public void method1();

    /* 新类的方法 */
    public void method2();
}

class Adapter extends Source implements Target {

    public void method2() {
        System.out.println("this is the Target method!");
    }
}

public class AdapterTest {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.method1();
        target.method2();
    }
}
