package com.taiyuan.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jdbcutil {
    private static final String URL = "jdbc:mysql://192.168.127.188:3306/xiaomei?useUnicode=true&characterEncoding=utf8";
    private static final String USERNAME="root";
    private static final String PASSWORD="123456";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    //将通用的增删改封装起来
    public static int executeUpdate(String sql,Object... params){
        int result = 0;
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(sql);
            if(params!=null){
                for(int i=0;i<params.length;i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(con,pstmt);
        }
        return result;
    }
    //封装关闭方法
    //封装通用查询
    public static <T> List<T> excuteQuery(String sql,Class<T> clz){
        List<T> list = new ArrayList<>();
        //Student继承Object   但是List<Student> 没有继承关系List<object>
        return list;
    }
    static void close(Connection con,PreparedStatement pstmt){
        try {
            if(pstmt!=null){
                pstmt.close();
            }
            if(con!=null){
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void close(Connection con, PreparedStatement pstmt, ResultSet rs){
        try {
            if(rs!=null)
                rs.close();
            close(con,pstmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
