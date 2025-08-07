package DAY3;

import java.util.*;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void showAvailableBooks() {
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(book);
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    public void issueBook(String bookTitle, String userName) {
        Book book = findBookByTitle(bookTitle);
        User user = findUserByName(userName);

        if (book != null && user != null && !book.isIssued()) {
            book.issue();
            user.borrowBook(book);
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book cannot be issued.");
        }
    }

    public void returnBook(String bookTitle, String userName) {
        Book book = findBookByTitle(bookTitle);
        User user = findUserByName(userName);

        if (book != null && user != null && book.isIssued()) {
            book.returnBook();
            user.returnBook(book);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book cannot be returned.");
        }
    }
}
