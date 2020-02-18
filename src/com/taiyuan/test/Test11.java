package com.taiyuan.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
* 分层开发：数据访问层：Dao层又叫持久层     将数据持久化与数据库进行交互
*           业务逻辑层：service层又叫服务层   串联业务逻辑
*           视图层：web层又叫表现层    与用户进行交互
*           数据模型：（model、bean、javabean、pojo）对应数据库的每一个表    每个表都对应一个类  每个字段对应的是类中的属性
*
* */
public class Test11 {
    public static void main(String[] args) {
       String url = "jdbc:mysql://192.168.127.188:3306/xiaomei?useUnicode=true&characterEncoding=utf8";
       String username = "root";
       String password = "123456";
       Connection con = null;
       PreparedStatement pstmt = null;
       try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("insert into Student(Sno,Sname,Ssex,Sage,Sdept) values(2,'张小磊','男',22,'经管系')");
            int i =pstmt.executeUpdate();
            System.out.println(i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
           try {
                if(con!=null)
                    con.close();
                if (pstmt!=null)
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }
}
