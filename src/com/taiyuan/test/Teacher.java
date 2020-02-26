package com.taiyuan.test;

public abstract class Teacher {
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Teacher() {
    }

    private String name;
    private int age;
    public abstract void teach();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*public void methods(){

    }*/
}
