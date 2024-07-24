import java.util.Scanner;  // Import the Scanner class

public class input {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);  
        // Create a Scanner object
        System.out.println("Enter first name");
        String userName = no.nextLine();  
        // Read user input
        Scanner nu = new Scanner(System.in);  
        // Create a Scanner object
        System.out.println("Enter second name");
        String user = nu.nextLine();  // Read user input
        System.out.println("Username is: " + userName + " " + user);  
        // Output user input
    }
}
