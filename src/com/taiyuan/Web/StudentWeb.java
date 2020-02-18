package com.taiyuan.Web;

import com.taiyuan.Service.IstudentService;
import com.taiyuan.Service.StudentService;
import com.taiyuan.pojo.Student;

import java.util.List;
import java.util.Scanner;

public class StudentWeb {
    IstudentService studentService = new StudentService();
    public void showmain(){
        System.out.println("---------------------------");
        System.out.println("1----------------------查询");
        System.out.println("2----------------------添加");
        System.out.println("3----------------------修改");
        System.out.println("4----------------------删除");
        System.out.println("其他-------------------退出");
        System.out.println("---------------------------");
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                query();break;
            case 2:
                System.out.println("添加");break;
            case 3:
                System.out.println("修改");break;
            case 4:
                System.out.println("删除");break;
            default:
                System.exit(0);
        }
    }
    public void query(){
         //此处调用service提供的方法
       List<Student> list = studentService.query();
       for(Student student:list){
           System.out.println(student);
       }
    }

}
