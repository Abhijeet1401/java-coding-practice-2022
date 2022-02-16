import java.util.Scanner;

/*
Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number.
We prepare for cross questions
like using iteration over recursion and how to optimize the solution using caching and memoization
 */
public class Fibonacci {
	public static void main(String[]args){
		int x=0 ;
		int x1 =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("input limit for series: ");
		int N = sc.nextInt();

		int x2; int count= N;
		for(int i=2;i<count;i++){
			x2 = x +x1;
			System.out.println(x2);
			x = x1;
			x1=x2;
		}


	}

}
