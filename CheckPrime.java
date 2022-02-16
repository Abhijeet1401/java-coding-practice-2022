import java.util.Scanner;

public class CheckPrime {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check");
		int num = sc.nextInt();
		int x = num / 2,flag =0;
		if (num == 0 || num == 1) {
			System.out.println("Number is not prime");
		} else
			for (int i = 2; i < x; i++) {
				if (num % i == 0) {
					System.out.println("Number is not prime");
					flag = 1;
					break;
				}
			}
	     if(flag ==0){
		     System.out.println(num+" is prime number");
	     }
	}

}
