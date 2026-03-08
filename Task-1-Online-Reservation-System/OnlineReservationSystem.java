import java.util.Scanner;

public class OnlineReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.println("===== ONLINE RESERVATION SYSTEM =====");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals(username) && pass.equals(password)) {

            System.out.println("\nLogin Successful!");

            System.out.println("\nReservation Menu");
            System.out.println("1. Make Reservation");
            System.out.println("2. Cancel Reservation");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            
            

            if (choice == 1) {

                System.out.print("Enter Passenger Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Train Number: ");
                int trainNumber = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Train Name: ");
                String trainName = sc.nextLine();

                System.out.print("Enter Class Type: ");
                String classType = sc.nextLine();

                System.out.print("Enter Date of Journey: ");
                String date = sc.nextLine();

                System.out.print("Enter From (Place): ");
                String from = sc.nextLine();

                System.out.print("Enter To (Destination): ");
                String to = sc.nextLine();

                System.out.println("\n===== Reservation Successful =====");
                System.out.println("Passenger Name: " + name);
                System.out.println("Train Number: " + trainNumber);
                System.out.println("Train Name: " + trainName);
                System.out.println("Class Type: " + classType);
                System.out.println("Journey Date: " + date);
                System.out.println("From: " + from);
                System.out.println("To: " + to);

            }

            else if (choice == 2) {

                System.out.print("Enter PNR number to cancel: ");
                int pnr = sc.nextInt();

                System.out.println("Reservation with PNR " + pnr + " has been cancelled.");

            }

            else {
                System.out.println("Invalid choice.");
            }

        }

        else {
            System.out.println("Invalid Login Credentials.");
        }

        sc.close();
    }
}
