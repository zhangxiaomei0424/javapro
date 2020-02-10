package com.taiyuan.test;

public class Test4 {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("张三",6000,2);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("李四",150,20,5);
        SalesEmployee salesEmployee = new SalesEmployee("王五",300000,0.4,5);
        System.out.println(hourlyEmployee.getSalary(4));
        System.out.println(salariedEmployee.getSalary(4));
        System.out.println(salesEmployee.getSalary(4));
    }
}
