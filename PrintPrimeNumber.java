import java.util.Scanner;

public class PrintPrimeNumber {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("First number");
		int firstNum = sc.nextInt();
		System.out.println("Enter second number");
		int SecondNum = sc.nextInt();
		for (int i = firstNum; i < SecondNum; i++) {
			if (isPrime(i)) {
				System.out.println(i + "=" + "prime number");
			}
		}

	}
		 public static boolean isPrime(int n ) {
		    if(n<=1){
		    	return false;
		    }
		    for(int i =2;i<=n/2;i++){
			     if(n % i ==0){
			     	return false;
			     }
		    }
		    return true;
		 }
		 }




