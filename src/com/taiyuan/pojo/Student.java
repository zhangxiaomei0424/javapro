package com.taiyuan.pojo;

public class Student {
    private Integer Sno;
    private String Sname;
    private String Ssex;
    private Integer Sage;
    private String Sdept;
    /*static {
        System.out.println("student静态代码块");
    }*/
   /* {
        System.out.println("student构造代码块");
    }*/
    public Student() {
        //System.out.println("构造方法");
    }

    public Student(Integer sno) {
        this.Sno = sno;
    }

    public Student(String sname, String ssex, Integer sage, String sdept) {
        this.Sname = sname;
        this.Ssex = ssex;
        this.Sage = sage;
        this.Sdept = sdept;
    }

    public Student(Integer sno, String sname, String ssex, Integer sage, String sdept) {
        this.Sno = sno;
        this.Sname = sname;
        this.Ssex = ssex;
        this.Sage = sage;
        this.Sdept = sdept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sno=" + Sno +
                ", Sname='" + Sname + '\'' +
                ", Ssex='" + Ssex + '\'' +
                ", Sage=" + Sage +
                ", Sdept='" + Sdept + '\'' +
                '}';
    }

    public Integer getSno() {
        return Sno;
    }

    public void setSno(Integer sno) {
        Sno = sno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String ssex) {
        Ssex = ssex;
    }

    public Integer getSage() {
        return Sage;
    }

    public void setSage(Integer sage) {
        Sage = sage;
    }

    public String getSdept() {
        return Sdept;
    }

    public void setSdept(String sdept) {
        Sdept = sdept;
    }
}
