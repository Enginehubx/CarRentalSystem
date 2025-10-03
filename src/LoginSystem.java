import java.io.Console;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        // Predefined correct username and password
        final String USERNAME = "admin";
        final String PASSWORD = "12345";

        Scanner sc = new Scanner(System.in);
        Console console = System.console(); // For secure password masking

        int attempts = 0; // counter for login attempts
        boolean success = false;

        System.out.println("==== LOGIN SYSTEM ====");
        
        while (attempts < 3) { // allow 3 tries
            System.out.print("Enter username: ");
            String enteredUsername = sc.nextLine();

            String enteredPassword = "";
            if (console != null) {
                // If running in terminal, readPassword hides input
                char[] passwordArray = console.readPassword("Enter password: ");
                enteredPassword = new String(passwordArray);
            } else {
                // If running in IDE (like Eclipse/NetBeans) use Scanner
                System.out.print("Enter password: ");
                enteredPassword = sc.nextLine();
            }

            // Check if username and password match
            if (enteredUsername.equals(USERNAME) && enteredPassword.equals(PASSWORD)) {
<<<<<<< HEAD
                System.out.println(" Login Successful! Welcome, " + USERNAME + ".");
                success = true;
                break; // exit loop on success
            } else {
                System.out.println(" Invalid username or password. Try again.");
=======
                System.out.println("Login Successful! Welcome, " + USERNAME + ".");
                success = true;
                break; // exit loop on success
            } else {
                System.out.println("Invalid username or password. Try again.");
>>>>>>> a30b2effb83edd8bbdda4948f7e54aea361bae3b
                attempts++;
                System.out.println("Attempts left: " + (3 - attempts));
            }
        }

        if (!success) {
            System.out.println("Login failed. Maximum attempts reached.");
        }

        sc.close();
    }
}
