/*
3.Write a program to split a string containing two words using StringTokenizer without 
using hasMoreTokens() method and call nextToken() method three times.Add an exception handling 
block if necessary.
 */
package Assignment5_10;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		String str = "Shweta Padwal";

		StringTokenizer tokenizer = new StringTokenizer(str);

		try {

			System.out.println("First token: " + tokenizer.nextToken());
			System.out.println("Second token: " + tokenizer.nextToken());
			System.out.println("Third token: " + tokenizer.nextToken());
		} catch (Exception e) {
			System.out.println("Exception: All tokens are done.No more tokens");
		}
	}
}
