package Assignment5_10;
import java.util.Scanner;

class NegativeNumberException extends ArithmeticException {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class ZeroNumberException extends ArithmeticException {
    public ZeroNumberException(String message) {
        super(message);
    }
}

class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int Add() throws NegativeNumberException {
        if (num1 < 0 || num2 < 0) {
            throw new NegativeNumberException("Negative number(s) provided for addition.");
        }
        return num1 + num2;
    }

    // Method for subtraction
    public int Subtract() throws NegativeNumberException {
        if (num1 < 0 || num2 < 0) {
            throw new NegativeNumberException("Negative number(s) provided for subtraction.");
        }
        return num1 - num2;
    }

    public int Multiply() throws ZeroNumberException {
        if (num1 == 0 || num2 == 0) {
            throw new ZeroNumberException("Zero number(s) provided for multiplication.");
        }
        return num1 * num2;
    }

    public int Division() throws ZeroNumberException {
        if (num1 == 0 || num2 == 0) {
            throw new ZeroNumberException("Zero number(s) provided for division.");
        }
        return num1 / num2;
    }
}

public class calculatorMain { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number for addition: ");
            int addNum1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter second number for addition: ");
            int addNum2 = Integer.parseInt(scanner.nextLine());
            Calculator addCalculator = new Calculator(addNum1, addNum2);
            System.out.println("Addition: " + addCalculator.Add());

           
            System.out.print("Enter first number for subtraction: ");
            int subNum1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter second number for subtraction: ");
            int subNum2 = Integer.parseInt(scanner.nextLine());
            Calculator subCalculator = new Calculator(subNum1, subNum2);
            System.out.println("Subtraction: " + subCalculator.Subtract());

         
            System.out.print("Enter first number for multiplication: ");
            int mulNum1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter second number for multiplication: ");
            int mulNum2 = Integer.parseInt(scanner.nextLine());
            Calculator mulCalculator = new Calculator(mulNum1, mulNum2);
            System.out.println("Multiplication: " + mulCalculator.Multiply());

            System.out.print("Enter first number for division: ");
            int divNum1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter second number for division: ");
            int divNum2 = Integer.parseInt(scanner.nextLine());
            Calculator divCalculator = new Calculator(divNum1, divNum2);
            System.out.println("Division: " + divCalculator.Division());

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid integer values.");
        } catch (NegativeNumberException | ZeroNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
    }
}




