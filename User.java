package DAY3;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Book> borrowedBooks;

    public User(String name) {
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
