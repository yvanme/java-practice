package com.loong.原型模式.简单形式;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-04-23 9:44
 **/

/**
 * 抽象原型角色
 */
interface Prototype{
    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象
     */
    public Object clone();
}

/**
 * 具体原型角色
 */
class ContactPrototype implements Prototype {
    //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
    public Object clone(){

        Prototype prototype = new ContactPrototype();

       return prototype;
    }
}

/**
 * 客户端角色
 */
class Client{

    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public void operation(Prototype prototype){
        //需要创建原型接口的对象
        Prototype copyPrototype = (Prototype) prototype.clone();

    }
}
public class PrototypeTest {
}
