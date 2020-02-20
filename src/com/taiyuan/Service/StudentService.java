package com.taiyuan.Service;

import com.taiyuan.Dao.IstudentDao;
import com.taiyuan.Dao.StudentDao;
import com.taiyuan.pojo.Student;

import java.util.List;

public class StudentService implements IstudentService {
    IstudentDao studentDao = new StudentDao();
    @Override
    public List<Student> query() {
        return studentDao.query();
    }

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int del(int Sno) {
        return studentDao.del(Sno);
    }

    @Override
    public Student queryone(int Sno) {
        return null;
    }
}
