package Entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    Scanner scan = new Scanner(System.in);
    public String name;
    public static ArrayList<Book> books;
    Book book = new Book();

    public Library() {

        books=new ArrayList<>();
    }
    public void addBook(Book book){
        for (Book item: books) {
            if (item.equals(book)) {
                item.count += book.count;
                return;
            }
        }
        books.add(book);
    }
    public void addBook(){
        Book book = newBook(new Book());
        addBook(book);
        System.out.println("Yeni kitab elave edildi! \n");
        book.fullInfo();
    }
    public Book newBook(Book book){
        System.out.print("Kitab adını daxil edin: ");
        book.name = getNonEmptyString();

        System.out.print("Yazıçının adını daxil edin: ");
        book.author = getNonEmptyString();

        System.out.print("Dili seçin: aze, ru, eng--> ");
        book.language = getNonEmptyString();

        System.out.print("Qiyməti daxil edin: ");
        book.price = getPositiveNumber();

        System.out.print("Kitab sayını daxil edin: ");
        book.count = (int)getPositiveNumber();

        return book;
    }
    public void updateBook() {
            System.out.print("Enter ID to update: ");
            Book book = findBookById((int)getPositiveNumber());
            if (book == null) {
                System.out.println("Id not found");
                return;
            }
        newBook(book);

        System.out.println("Update successful. Updated book: ");
        book.fullInfo();
    }
    public void deleteBook() {
        System.out.print("Enter ID to delete: ");
        Book book = findBookById((int)getPositiveNumber());
        if (book==null){
            System.out.println("Kitab tapılmadı ");
            return;
        }
        books.remove(book);
        System.out.println("Book deleted");
    }
    public void findBook(String bookName){
        Book book = books.stream().filter(x->x.name== bookName).findFirst().orElse(null);
        if (book!=null) {
            System.out.println(" '" + bookName + "' adli kitab kitabxanada movcuddur");
        } else {
            System.out.println(" '" + bookName + "'adli kitab tapilmadi");
        }
    }
    public Book findBookById(int targetId) {
        return books.stream().filter(x->x.getId()== targetId).findFirst().orElse(null);
    }
    public void showBook(){
        for (Book book: books){
          book.fullInfo();
        }
    }
    public String getNonEmptyString(){
        String str = " ";
        while(true){
            str = scan.nextLine();
            if (str.isBlank() || str.isEmpty())
                System.out.print("Zehmet olmasa melumat daxil edin: ");
            else return str;
        }
    }
    public double getPositiveNumber(){
        double num = -1;
        while(num < 0) {
            try {
                Scanner scanner = new Scanner(System.in);
                num = scanner.nextDouble();
                if (num < 0) {
                    System.out.print("Please enter a positive number: ");
                }
            } catch (Exception exp) {
                System.out.print("Please enter invalid number: ");
            }
        }
        return num;
    }
}
