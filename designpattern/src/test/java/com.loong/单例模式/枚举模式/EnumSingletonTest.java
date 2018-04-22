package com.loong.单例模式.枚举模式;

enum Singleton {
    DATASOURCE;
    private DBConnection connection = null;
    private Singleton() {
        connection = new DBConnection();
    }
    public DBConnection getConnection() {
        return connection;
    }
}

//模拟一个数据库连接类：

class DBConnection {
    //测试通过枚举获取的实例是否相同：

}

public class EnumSingletonTest{
    public static void main(String[] args) {
        DBConnection con1 = Singleton.DATASOURCE.getConnection();
        DBConnection con2 = Singleton.DATASOURCE.getConnection();

        System.out.println(con1 == con2);
    }
}


