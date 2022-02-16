import java.util.Scanner;

class SwapTwoNumbers {
	// Write a Java Program to swap two numbers using the third variable.
	public static void main(String[] args) {
		int a,b;
		int temp=-0;
		System.out.println("enter number to be swap");
		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		 b= sc.nextInt();
		System.out.println("Number before swap:" +a+b);
		 temp=a;
		 a= b;
		 b= temp;
		System.out.println("Number after swap: "+a+b);

	}
}

