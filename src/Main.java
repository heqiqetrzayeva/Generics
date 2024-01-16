import Entities.Book;
import Entities.Library;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.getId();
        book.fullInfo();
        Library library =new Library();
        library.addBook(book);
        library.showBook();

    }

}
