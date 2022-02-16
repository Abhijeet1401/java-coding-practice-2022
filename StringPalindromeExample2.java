import java.util.Scanner;

public class StringPalindromeExample2 {
	public static void main( String[]args) {
		String original;
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check palindrome: ");
		original = sc.nextLine();
		int strLength = original.length();
		for (int i = 0; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse)){  // original.equals(reverse)
			System.out.println("String is not Palindrome ");
	    }else
			System.out.println("String is not Palindrome");
	}
}
