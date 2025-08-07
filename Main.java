package DAY3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Sample books and users
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("1984", "George Orwell"));
        library.registerUser(new User("Vaishnavi"));
        library.registerUser(new User("Rahul"));

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show Available Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.showAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter book title: ");
                    String bookToIssue = sc.nextLine();
                    System.out.print("Enter your name: ");
                    String userToIssue = sc.nextLine();
                    library.issueBook(bookToIssue, userToIssue);
                    break;
                case 3:
                    System.out.print("Enter book title: ");
                    String bookToReturn = sc.nextLine();
                    System.out.print("Enter your name: ");
                    String userToReturn = sc.nextLine();
                    library.returnBook(bookToReturn, userToReturn);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
