import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== BASIC ARITHMETIC CALCULATOR ===");
        System.out.println("Operations available:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        
        boolean continueCalculating = true;
        
        while (continueCalculating) {
            System.out.println("\nSelect operation (1-5): ");
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                continueCalculating = false;
                continue;
            }
            
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please select 1-5.");
                continue;
            }
            
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result = 0;
            boolean validOperation = true;
            
            switch (choice) {
                case 1: // Addition
                    result = add(num1, num2);
                    System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                    break;
                    
                case 2: // Subtraction
                    result = subtract(num1, num2);
                    System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                    break;
                    
                case 3: // Multiplication
                    result = multiply(num1, num2);
                    System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                    break;
                    
                case 4: // Division
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                        validOperation = false;
                    } else {
                        result = divide(num1, num2);
                        System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                    }
                    break;
            }
            
            if (validOperation) {
                System.out.println("Result: " + result);
            }
        }
        
        scanner.close();
    }
    
    // Arithmetic methods
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double divide(double a, double b) {
        return a / b;
    }
}