import java.util.Scanner;

public class ReverseStringCharArrayMethod {
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("enter String to reverse");
		  String str = sc.nextLine();
		  int leftChar =0;
		  char[] tempArray = str.toCharArray();
		  int rightChar = tempArray.length-1;

		  for(leftChar=0;leftChar<rightChar;leftChar++ ,rightChar--)
		  {
		  	char temp = tempArray[leftChar];
		  	tempArray[leftChar] =tempArray[rightChar];
		  	tempArray[rightChar]=temp;

		  }

		for (char c: tempArray) {
			System.out.print(c);
			System.out.println();

		}



	}
}
