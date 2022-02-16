import java.util.Scanner;

/*
     Using built in reverse() method of the StringBuilder class: String class does not have reverse() method,
     we need to convert the input string to StringBuilder, which is achieved by using the append method of StringBuilder.
     After that,
     print out the characters of the reversed string by scanning from the first till the last index.
 */
public class ReverseString2 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String  str = sc.nextLine();

		StringBuilder string = new StringBuilder();
		// append a string into StringBuilder string
		 string.append(str);
		// reverse StringBuilder str
		string.reverse();
		// print reversed String
		System.out.println(string);

	}
}
