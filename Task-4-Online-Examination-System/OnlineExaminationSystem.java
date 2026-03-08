import java.util.Scanner;

public class OnlineExamination {

    static String username = "student";
    static String password = "1234";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== ONLINE EXAMINATION SYSTEM ===");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals(username) && pass.equals(password)) {

            int choice;

            do {

                System.out.println("\n1. Start Exam");
                System.out.println("2. Change Password");
                System.out.println("3. Logout");

                System.out.print("Enter choice: ");
                choice = Integer.parseInt(sc.nextLine());

                if (choice == 1) {

                    int score = 0;

                    System.out.println("\nExam Started!");

                    System.out.println("\nQ1: Java is a ?");
                    System.out.println("1. Programming Language");
                    System.out.println("2. Database");
                    System.out.println("3. Operating System");

                    int ans1 = Integer.parseInt(sc.nextLine());
                    if (ans1 == 1) score++;

                    System.out.println("\nQ2: JVM stands for ?");
                    System.out.println("1. Java Virtual Machine");
                    System.out.println("2. Java Variable Machine");
                    System.out.println("3. Java Visual Machine");

                    int ans2 = Integer.parseInt(sc.nextLine());
                    if (ans2 == 1) score++;

                    System.out.println("\nExam Submitted Automatically!");
                    System.out.println("Your Score: " + score + "/2");
                }

                else if (choice == 2) {

                    System.out.print("Enter new password: ");
                    password = sc.nextLine();

                    System.out.println("Password updated successfully!");
                }

            } while (choice != 3);

            System.out.println("Logged out successfully.");
        }

        else {
            System.out.println("Invalid Login.");
        }

        sc.close();
    }
}
