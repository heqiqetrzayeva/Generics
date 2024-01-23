import Entities.Book;
import Entities.Library;
import Entities.Update;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static Entities.Library.books;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("Anna Karenina", "Leo Tolstoy", "ru", 25, 6));
        library.addBook(new Book("Kozetta", "Victor Hugo", "en", 22, 8));
        library.addBook(new Book("Çalikusu", "Resat Nuri Güntekin", "tr", 15, 4));
        library.addBook(new Book("O Gecə Yağış Yağırdı" , "Elxan Elatlı", "az", 30, 11));
        library.addBook(new Book("Kozetta", "Victor Hugo", "az", 14, 8));

            Scanner scan = new Scanner(System.in);
            System.out.print("Kitabxana adını qeyd edin: ");
            library.name = library.getNonEmptyString();
        do {
            System.out.println("Növbəti əməliyyata keçid edin: ");
            System.out.println("1: Add book");
            System.out.println("2: Update book");
            System.out.println("3: Delete book");
            System.out.println("4: Find book");
            System.out.println("5: Show book");
            System.out.println("6: Search book");

            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    library.addBook();
                    break;
                case "2":
                    library.updateBook();
                    break;
                case "3":
                    library.deleteBook();
                    break;
                case "4":
                    System.out.print("Kitab adını daxil edin: ");
                    library.findBook((library.getNonEmptyString()));
                    break;
                case "5":
                    library.showBook();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Uyğun rəqəm daxil edin!");
            }

        } while(true);
    }

}



