package com.taiyuan.test;

public class Circle extends Shape {
    private double radius;
    public Circle(){}
    public Circle(double radius,String color){
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPer() {
        return 2*3.14*radius;
    }
    @Override
    public void showAll() {
        System.out.println("圆形面积="+getArea());
        System.out.println("圆形周长="+getPer());
        System.out.println("圆形颜色="+getColor());
    }
}
