package com.taiyuan.Dao;

import com.taiyuan.pojo.Student;
import com.taiyuan.util.Jdbcutil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements IstudentDao{
    String url="jdbc:mysql://192.168.127.188:3306/xiaomei?useUnicode=true&characterEncoding=utf8";
    String username="root";
    String password="123456";

    @Override
    public List<Student> query() {
        List<Student> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
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
        //int i= 0;
        /*String sql = "insert into Student (Sname,Ssex,Sage,Sdept) values(?,?,?,?)";
        Object[] params = {student.getSname(),student.getSsex(),student.getSage(),student.getSdept()};
        int i = Jdbcutil.executeUpdate(sql,params);*/
        return Jdbcutil.executeUpdate("insert into Student (Sname,Ssex,Sage,Sdept) values(?,?,?,?)",student.getSname(),student.getSsex(),student.getSage(),student.getSdept());
       /* Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("insert into Student (Sname,Ssex,Sage,Sdept) values(?,?,?,?) ");
            pstmt.setString(1,student.getSname());
            pstmt.setString(2,student.getSsex());
            pstmt.setInt(3,student.getSage());
            pstmt.setString(4,student.getSdept());
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
    }

    @Override
    public int update(Student student) {
        /*String sql = "update Student  set Sname=?,Ssex=?,Sage=?,Sdept=?  where Sno =? ";
        Object[] params = {student.getSname(),student.getSsex(),student.getSage(),student.getSdept(),student.getSno()};
        int i = Jdbcutil.executeUpdate(sql,params);*/
        return Jdbcutil.executeUpdate("update Student  set Sname=?,Ssex=?,Sage=?,Sdept=?  where Sno =? ",student.getSname(),student.getSsex(),student.getSage(),student.getSdept(),student.getSno());
       /* int i= 0;
        Connection con = null;i
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("update Student  set Sname=?,Ssex=?,Sage=?,Sdept=?  where id =? ");
            pstmt.setString(1,student.getSname());
            pstmt.setString(2,student.getSsex());
            pstmt.setInt(3,student.getSage());
            pstmt.setString(4,student.getSdept());
            pstmt.setInt(5,student.getSno());
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
    }
    @Override
    public int del(int Sno) {
        /*String sql = "delete from Student where Sno =? ";
        Object[] params = {Sno};
        int i = Jdbcutil.executeUpdate(sql,params);;*/
        return Jdbcutil.executeUpdate("delete from Student where Sno =? ",Sno);
        /*int i= 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("delete from Student where Sno =? ");
            pstmt.setInt(1,Sno);
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
    }

    @Override
    public Student queryOne(int Sno) {
        return null;
    }
}
