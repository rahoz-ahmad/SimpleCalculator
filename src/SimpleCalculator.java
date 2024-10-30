//3. Simple Calculator with Methods
//This version uses a switch statement directly in main() for simplicity.

import java.util.Scanner;
public class SimpleCalculator {

 
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Answer: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Answer: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Answer: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Answer: " + (num1 / (double) num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        scanner.close();
    }
    
}
