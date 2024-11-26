import library.books.FictionBook;
import library.Utils.*;

public class libraryDemo {
    public static void main(String[] args) {
        FictionBook book = new FictionBook("1984", "George Orwell", "Dystopian");
        BookUtils.printBookDetails(book);
    }
}
