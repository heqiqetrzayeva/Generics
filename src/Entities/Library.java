package Entities;

import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books;

    public Library() {
        books=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void showBook(){
        System.out.println(books);
    }
}
