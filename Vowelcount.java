/*
5.Write a JAVA program to create a method that takes a string as input and 
throws an exception if the string does not contain vowels.
 */
package Assignment5_10;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		try {
			if (!input.toLowerCase().matches("[aeiou]")) {
				throw new Exception("The string does not contain any vowels.");
			}
			System.out.println("The string contains vowels.");
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

	}
}
