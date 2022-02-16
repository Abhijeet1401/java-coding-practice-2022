import java.util.Scanner;

// Write a Java Program to swap two numbers without using the third variable.
public class SwapWithoutThirdVariable {
	public static void main(String[] args) {
		int x,y;
		System.out.println("enter number to be swap x and y :");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before swapping\n x = "+x+"\n y = "+y);
		x = x +y;
		y = x -y;
		x = x -y;
		System.out.println("after swapping without third variable \nx =  "+x+"\n y =  "+y);

	}
}
