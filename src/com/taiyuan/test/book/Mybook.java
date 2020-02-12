package com.taiyuan.test.book;

public class Mybook {
    private String name;
    private double price;
    private String press;
    private String author;
    private String bookISBN;

    public Mybook(String name, double price, String press, String author, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
        this.bookISBN = bookISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }
    public String toString(){
        return "name:"+name+",press:"+press+",author:"+author+",price:"+price+",bookISBN:"+bookISBN;
    }
}
