import java.util.Scanner;

public class ReverseString4 {
	public static void main(String[] args)
	{
		//
		// String input = "GeeksForGeeks";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String  str = sc.nextLine();

		// convert String to character array
		// by using toCharArray
		char[] try1 = str.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);
	}
}
