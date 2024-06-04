package Homework;

public static class PrintMyBook extends Book{

    public PrintMyBook(String author_name, String bookName, int price) {
        super(author_name, bookName, price);
    }
    void printDetails(){
        System.out.println();
    }
}

public static void main(String[] args) {
    Book myBook = new PrintMyBook("")
}