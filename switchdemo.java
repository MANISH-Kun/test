import java.util.Scanner;

public class switchdemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int res = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: +, -, *, /");
        char choice = sc.next().charAt(0);  // Read first character from input

        switch (choice) {
            case '+': {
                res = a + b;
                System.out.println("Result: " + res);
               
            }
             break;
            case '-': {
                res = a - b;
                System.out.println("Result: " + res);
                break;
            }
            case '*': {
                res = a * b;
                System.out.println("Result: " + res);
                break;
            }
            case '/': {
                if (b != 0) {
                    res = a / b;
                    System.out.println("Result: " + res);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            }
            default: {
                System.out.println("Invalid choice");
            }
        }

        sc.close(); // Close the scanner
    }
}
