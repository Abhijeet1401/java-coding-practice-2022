import java.util.Scanner;

public class ReverseString {
	public static void main(String[]args){

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter String: ");
		str = sc.next();
		 String revStr="";
		 char  ch;
		 for(int i =0;i<str.length();i++){

		 	ch = str.charAt(i);

		 	revStr = ch+revStr;
		 }
		System.out.println("reversed String: "+revStr);
	}
}
