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

        if(user.equals(username) && pass.equals(password)) {

            System.out.println("Login Successful!\n");
            System.out.println("Starting Exam...\n");

            int score = 0;

            System.out.println("Q1: Java is a ?");
            System.out.println("1. Programming Language");
            System.out.println("2. Database");
            System.out.println("3. Operating System");
            int ans1 = sc.nextInt();

            if(ans1 == 1) score++;

            System.out.println("\nQ2: JVM stands for ?");
            System.out.println("1. Java Variable Machine");
            System.out.println("2. Java Virtual Machine");
            System.out.println("3. Java Visual Machine");
            int ans2 = sc.nextInt();

            if(ans2 == 2) score++;

            System.out.println("\nExam Finished!");
            System.out.println("Your Score: " + score + "/2");

            System.out.println("Logging out...");
        }

        else {
            System.out.println("Invalid Login");
        }
    }
}
