package com.taiyuan.Dao;

import com.taiyuan.pojo.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements IstudentDao{
    String url="jdbc:mysql://192.168.127.188:3306/xiaomei?useUnicode=true&characterEncoding=utf8";
    String username="root";
    String password="123456";
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    @Override
    public List<Student> query() {
        List<Student> list = new ArrayList<>();
        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("select Sno,Sname,Ssex,Sage,Sdept from Student");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Student student = new Student();
                student.setSno(rs.getInt("Sno"));
                student.setSname(rs.getString("Sname"));
                student.setSsex(rs.getString("Ssex"));
                student.setSage(rs.getInt("Sage"));
                student.setSdept(rs.getString("Sdept"));
                list.add(student);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (rs !=null)
                    rs.close();
                if(pstmt != null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public int add(Student student) {
        return 0;
    }

    @Override
    public int update(Student student) {
        return 0;
    }

    @Override
    public int del(int id) {
        return 0;
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
