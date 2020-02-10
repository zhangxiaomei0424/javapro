package com.taiyuan.test;

public abstract class ColaEmployee {
    public ColaEmployee(String name,int month){
        this.name = name;
        this.month = month;
    }
    private int month;
    private String name;
    public  abstract double getSalary(int month);

}
