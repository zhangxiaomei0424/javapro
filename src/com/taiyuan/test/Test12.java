package com.taiyuan.test;

import com.taiyuan.Web.StudentWeb;
import com.taiyuan.pojo.Student;
import com.taiyuan.util.Jdbcutil;
import com.taiyuan.util.MyArray;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
       /* StudentWeb studentWeb = new StudentWeb();
        studentWeb.showmain();
        studentWeb.input();*/
        //Student student = new Student();
        //student.setSno(1);
        /*Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();*/
        //MyArray<String> myArray = new MyArray();
        /*
        *   类在第一次使用的时候   会把class加载到内存的方法区中
        *   并且在堆去中会创建一个class类型的对象，只想到该方法区中
        *   反射就是获取那个class类型的对象
        *   获取该对象的方法：
        *       1 类名.class
        *       2 对象名.getClass()
        *       3 Class.forName("类的完全限定名")
        *
        * */

        Class clz = Student.class;
       List<Student> list =  Jdbcutil.excuteQuery("",Student.class);
        //类下每一个方法都会封装成 Method类型的对象
        //类下每一个属性都会封装成Field类型的对象
        //有多少个属性就有多少个Field对象  有多少个方法就有多少个Method对象
        //实际上  Field是个数组   Method也是数组
       /* Field[] fields = clz.getDeclaredFields();
        for(Field f:fields){
            System.out.println(f.getName());
        }*/
//        System.out.println(fields.length);
        /*try {
            Class clz = Student.class;
            Student student = new Student();
            Class clz2 = student.getClass();
            Class clz3 = Class.forName("com.taiyuan.pojo.Student");
            System.out.println(clz==clz2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
    }
}
