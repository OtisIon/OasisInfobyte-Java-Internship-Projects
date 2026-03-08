import java.util.ArrayList;
import java.util.Scanner;

public class DigitalLibrary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> books = new ArrayList<>();

        books.add("Java Programming");
        books.add("Data Structures");
        books.add("Operating Systems");
        books.add("Computer Networks");

        int choice;

        do {

            System.out.println("\n=== DIGITAL LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {

                System.out.println("\nAvailable Books:");
                for (String book : books) {
                    System.out.println("- " + book);
                }
            }

            else if (choice == 2) {

                System.out.print("Enter book name to issue: ");
                String book = sc.nextLine();

                if (books.contains(book)) {
                    books.remove(book);
                    System.out.println("Book issued successfully.");
                } 
                else {
                    System.out.println("Book not available.");
                }
            }

            else if (choice == 3) {

                System.out.print("Enter book name to return: ");
                String book = sc.nextLine();

                books.add(book);
                System.out.println("Book returned successfully.");
            }

        } while (choice != 4);

        System.out.println("Exiting Library System...");
        sc.close();
    }
}
