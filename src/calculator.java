
import java.util.Scanner;

public class calculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Simple Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                keepRunning = false;
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean valid = true;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    valid = false;
            }

            if (valid) {
                System.out.println("Result: " + result);
            }
            System.out.println();
        }

        scanner.close();
    }
}

