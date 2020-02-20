package com.taiyuan.Dao;

import com.taiyuan.pojo.Student;

import java.util.List;

public interface IstudentDao {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int student);

    Student queryOne(int Sno);

}
