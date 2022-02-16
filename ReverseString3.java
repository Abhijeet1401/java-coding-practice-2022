import java.util.Scanner;

public class ReverseString3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to reverse");
		String str = sc.nextLine();
		// create temporary byte[] of equal length equal to the  length of input String
		byte [] strAsByteArray = str.getBytes();
		byte [] strResult = new byte[strAsByteArray.length];
		 for(int i = 0;i<strAsByteArray.length;i++)
		 	strResult[i]= strAsByteArray[strAsByteArray.length-i-1];
		System.out.println(new String(strResult));


	}
}