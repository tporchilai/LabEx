package Homework;

abstract class Book {
 String bookName;
 String author_name;
 int price;


    public Book(String author_name, String bookName, int price) {
        this.author_name = author_name;
        this.bookName = bookName;
        this.price = price;
    }
}

