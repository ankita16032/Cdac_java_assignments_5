/*
2.Create an integer array of size n and read the elements 
from the user .Add an exception handling block to print the 
value at nth position of the array
 */
package Assignment5_10;
import java.util.Scanner;
public class ArrayN {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try
		{
			int n;
			System.out.println("Enter Size of array");
			n=sc.nextInt();
			int arr[]=new int[n];
			
			System.out.println("Enter Elements for an array:");
			for(int i=0; i<n; i++)
			{
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Array Elements are:");
			for(int a: arr)
			{
				System.out.println(a);
			}
			
			System.out.println("Enter index number for the value:");
			int k;
			k=sc.nextInt();
			System.out.println("Value for given index is:");
			System.out.println(arr[k]);
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: Array Index out of bound");
		}
	}
}
