/*
4.Write a program to read a string and convert to integer using try catch block
 */
package Assignment5_10;

import java.util.Scanner;

public class StringtoInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.next();

		try {
			int hashCode = input.hashCode();
			System.out.println("The integer value is: " + hashCode);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input! Please enter a valid integer.");
		}
	}
}
