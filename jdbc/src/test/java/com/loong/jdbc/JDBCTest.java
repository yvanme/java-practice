package com.loong.jdbc;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class JDBCTest {

    private static Logger logger = Logger.getLogger(JDBCTest.class);

    @Test
    public void testJDBCTest(){
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
        try {
            logger.info("JDBC连接开始...");

            String URL ="jdbc:mysql://localhost:3306/test";
            String USERNAME = "root";
            String PASSWORD = "";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM student");
            while(resultSet.next()){
                System.out.println(resultSet.getString("name")+" "+resultSet.getInt("age"));
            }

            logger.info("JDBC连接结束...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(resultSet!=null){
                    resultSet.close();
                }
                if(preparedStatement!=null){
                    preparedStatement.close();
                }
                if(connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
