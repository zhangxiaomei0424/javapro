package com.taiyuan.test;

import java.io.*;

public class Test5 {
    public static void main(String[] args) {
        int a = 10;
        Student student = new Student();
        student.setId(10);
        student.setName("李四");
        student.setAge(22);
        student.setGrade("软件工程162601");
        //字节输出流
        /*File file = new File("d:/a");
        System.out.println(file.mkdirs());*/
        /*System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.getPath());*/
       /* try {
            OutputStream outputStream = new FileOutputStream(file,true);
            String b = "xiaomei";
            outputStream.write(b.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
       /* InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] b = new byte[4];
            int c = inputStream.read(b);
            while (c != -1){
                System.out.println("读取字节数："+c);
                new String(b,0,c);
                System.out.println(new String(b,0,c));
                c = inputStream.read(b);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
       /*
        char[] b = new char[4];
        Reader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String str =br.readLine();
            while (str!=null){
                System.out.println(str);
                str = br.readLine();
            }*/
            /*int c = reader.read(b);
            while(c!=-1){
                System.out.println("读取字符数"+c);
                System.out.println(new String(b,0,c));
                c = reader.read(b);
            }*/
            /*
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if (br != null) {
                    br.close();
                }
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        /*Writer writer = null;
        try {
            writer = new FileWriter(file,true);
            writer.write("xiao梅张晓梅");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }*/
        File from = new File("d:/Test3.java");
        File parent = new File("d:/a");
        if (!parent.exists()){
            parent.mkdirs();
        }
        File to = new File("d:/a/"+from.getName());
        InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] m = new byte[1024];
        try {
            inputStream = new FileInputStream(from);
            outputStream = new FileOutputStream(to);
            int length = inputStream.read(m);
            while (length!=-1){
                outputStream.write(m,0,length);
                outputStream.flush();
                length = inputStream.read(m);
            }
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (outputStream!=null)
                    outputStream.close();
                if (inputStream!=null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }
