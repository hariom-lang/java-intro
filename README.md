# java
login code in java
<br>
author - HARIOM SINGH

    import java.util.HashMap;
    import java.util.Scanner;
    
    public class login {
        private static HashMap<String, String> users = new HashMap<>();
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
    
            while (running) {
                System.out.println("1. Login");
                System.out.println("2. Sign up");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        login(scanner);
                        break;
                    case 2:
                        signUp(scanner);
                        break;
                    case 3:
                        running = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        break;
                }
            }
        }
    
        private static void login(Scanner scanner) {
            System.out.println("Login");
            System.out.print("Enter username: ");
            String username = scanner.next();
            System.out.print("Enter password: ");
            String password = scanner.next();
    
            if (users.containsKey(username) && users.get(username).equals(password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password.");
            }
        }
    
        private static void signUp(Scanner scanner) {
            System.out.println("Sign up");
            System.out.print("Enter new username: ");
            String username = scanner.next();
            System.out.print("Enter new password: ");
            String password = scanner.next();
    
            if (users.containsKey(username)) {
                System.out.println("Username already exists. Please choose another one.");
            } else {
                users.put(username, password);
                System.out.println("Sign up successful! You can now login.");
            }
        }
    }

2. getter and setter code in java

class Pen { // Private attributes private String color; private int tip;

// Getter method for color
String getColor() {
    return this.color;
}

// Getter method for tip
int getTip() {
    return this.tip;
}

// Setter method for color
public void setColor(String newColor) { this.color = newColor; }

// Setter method for tip
public void setTip(int tip) { this.tip = tip; } }

public class Oops6 { public static void main(String args[]) { // Creating a pen object called p1 Pen p1 = new Pen();

    // Setting color and printing it
    p1.setColor("Blue");
    System.out.println(p1.getColor());
    
    // Setting tip and printing it
    p1.setTip(5);
    System.out.println(p1.getTip());
    
    // Changing color and printing it
    p1.setColor("Yellow");
    System.out.println(p1.getColor());
}
}
