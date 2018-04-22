package com.loong.建造者模式;

/**
 * 产品是汽车:由多个部件组成
 *
 */
class Car {

    private String engine; //发动机
    private String body;   //车身
    private String chassis; //底盘

    //组装发动机
    public void addEngine(String engineName){
        this.engine = engineName;
    }
    //组装车身
    public void addBody(String bodyName){
        this.body = bodyName;
    }
    //组装底盘
    public void addChassis(String chassisName){
        this.chassis = chassisName;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
}
/**
 * 抽象一个Builder类，确定所有汽车（Car）都由发动机、车身、底部组建而成
 *
 */
abstract class CarBuilder {

    abstract void createEngine(); //生产发动
    abstract void createBody();//生产车身
    abstract void createChassis();//生产底盘
    abstract Car getCar();//组装后返回
}
/**
 * 生产奔驰的各部件，并组装
 *
 */
class BenciBuilder extends CarBuilder{

    private Car car = new Car();

    @Override
    void createEngine() {
        car.addEngine("奔驰发动机");
    }

    @Override
    void createBody() {
        car.addBody("奔驰车身");
    }

    @Override
    void createChassis() {
        car.addChassis("奔驰底盘");
    }

    @Override
    Car getCar() {
        return car;
    }
}
/**
 * 生产宝马的各部件，并组装
 *
 */
class BaomaBuilder extends CarBuilder{

    private Car car = new Car();

    @Override
    void createEngine() {
        car.addEngine("宝马发动机");
    }

    @Override
    void createBody() {
        car.addBody("宝马车身");
    }

    @Override
    void createChassis() {
        car.addChassis("宝马底盘");
    }

    @Override
    Car getCar() {
        return car;
    }
}
/**
 * 生产工人: 根据不同的汽车生产类指挥生产各部件
 *
 */
class BuildPerson {

    public void produce(CarBuilder builder){
        builder.createBody();
        builder.createChassis();
        builder.createEngine();
    }

}
public class CarBuilderTest {
    public static void main(String[] args) {
        //实例化工人
        BuildPerson person = new BuildPerson();

        //实例化奔驰建造者
        BenciBuilder builder = new BenciBuilder();
        //工人用奔驰建造者生产奔驰
        person.produce(builder);
        Car car = builder.getCar();
        System.out.println(car.getEngine());

        //实例化宝马生产类
        BaomaBuilder b = new BaomaBuilder();
        //工人用奔驰生产类生产奔驰
        person.produce(b);
        Car baoma = b.getCar();
        System.out.println(baoma.getEngine());
    }
}
