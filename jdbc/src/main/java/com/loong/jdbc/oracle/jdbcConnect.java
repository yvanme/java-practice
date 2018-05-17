package com.loong.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//注册驱动程序常量
class Constant{
    public static final String URL="jdbc:oracle:thin:@127.0.0.1:1521:sid";
    public static final String USERNAME="username";
    public static final String PASSWORD="password";
}
@SuppressWarnings("serial")
class DAOException extends Exception{
    public DAOException(){
        super();
    }
    public DAOException(String msd){
        super(msd);
    }
}

public class jdbcConnect {
    public void printProducts() throws DAOException{
        Connection c=null;
        Statement s=null;
        ResultSet r=null;
        try{
            //建立连接
            c=DriverManager.getConnection(Constant.URL,Constant.USERNAME,Constant.PASSWORD);
            s=c.createStatement();
            r=s.executeQuery("select id,name,price from t_product");
            System.out.println("ID\tNAME\tPRICE");
            while(r.next()){
                int x=r.getInt("id");
                String y=r.getString("name");
                float z=r.getFloat("price");
                System.out.println(x+"\t"+y+"\t"+z);
            }
        }catch(SQLException e){
            throw new DAOException("数据库异常");
        }finally{
            try{
                //关闭连接
                r.close();
                s.close();
                c.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
