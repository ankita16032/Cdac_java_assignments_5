/*
1.Write a program to calculate the square value of any number given by the user .
Add an exception handling block to check whether the user enter letters instead of numbers
 */
package Assignment5_10;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
           
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
           
            double square = number * number;
           
            System.out.println("The square of " + number + " is " + square);
        
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        }
        
    }
}
