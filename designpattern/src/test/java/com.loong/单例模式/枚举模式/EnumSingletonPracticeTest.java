package com.loong.单例模式.枚举模式;

class Connection{

}
enum SingletonConnection{
    CONNECTION;
    private Connection connection;
    private SingletonConnection(){
        connection = new Connection();
    }
    public Connection getSingleton(){
        return connection;
    }
}
public class EnumSingletonPracticeTest {
    public static void main(String[] args) {
        Connection connection = SingletonConnection.CONNECTION.getSingleton();
    }
}
