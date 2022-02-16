//Write a Java Program to find whether a string or number is palindrome or not.

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		String original, reverse="";
		int length;
		 Scanner sc = new Scanner(System.in);
		System.out.println("enter the number or string");
		original = sc.nextLine();
		length = original.length();
		for (int i =length -1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("reverse is:" +reverse);

		if(original.equals(reverse))
			System.out.println("The number is palindrome");
		else
			System.out.println("The number is not a palindrome");

	}
}



