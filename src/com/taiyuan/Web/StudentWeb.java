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
                add(scanner);break;
            case 3:
                update(scanner);break;
            case 4:
                del(scanner);break;
            default:
                System.exit(0);
        }
    }
    private void query(){
         //此处调用service提供的方法
       List<Student> list = studentService.query();
       for(Student student:list){
           System.out.println(student);
       }
    }
    private void add(Scanner scanner){
        System.out.println("请输入要添加的名字");
        String Sname = scanner.next();
        System.out.println("请输入要添加的性别");
        String Ssex = scanner.next();
        System.out.println("请输入要添加的年龄");
        int Sage = scanner.nextInt();
        System.out.println("请输入要添加的系别");
        String Sdept = scanner.next();
        Student student = new Student(Sname,Ssex,Sage,Sdept);
        studentService.add(student);
        query();
    }
    private void update(Scanner scanner){
        System.out.println("请输入要修改的学号");
        int Sno = scanner.nextInt();
        System.out.println("请输入要修改的名字");
        String Sname = scanner.next();
        System.out.println("请输入要修改的性别");
        String Ssex = scanner.next();
        System.out.println("请输入要修改的年龄");
        int Sage = scanner.nextInt();
        System.out.println("请输入要修改的系别");
        String Sdept = scanner.next();
        Student student = new Student(Sno,Sname,Ssex,Sage,Sdept);
        studentService.update(student);
        query();
    }
    private void del(Scanner scanner){
        System.out.println("请输入要删除的学号");
        int Sno = scanner.nextInt();
        studentService.del(Sno);
        query();
    }
}
