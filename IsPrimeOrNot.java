import java.util.Scanner;
//Write a Java Program to find whether a number is prime or not.
public class IsPrimeOrNot {
	public static void main(String[] args) {
		int num,temp;
		boolean isPrime = true;
		System.out.println("enter number to check prime");
		Scanner sc = new Scanner(System.in);
		 num = sc.nextInt();
		 sc.close();
		 for (int i =2;i<=num/2;i++){
		 	 temp = num % i;
		 	 if (temp==0) {
			     isPrime = false;
			     break;
		     }
		 }
		 if(isPrime)
			 System.out.println(num+": number is prime");
		 else
			 System.out.println(num +" number is not prime");
	}
}
