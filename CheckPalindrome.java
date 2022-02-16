public class CheckPalindrome {
	public static void main(String[]args){
		int n = 793;
		System.out.println(checkPalindrome(n));
	}
	public static boolean checkPalindrome(int n){
		int remainder; int temp=0;
		temp = n;
		int sum =0;
		 while(n>0){
		 	 remainder = n % 10;
		 	  sum = (sum*10)+remainder;
		 	  n = n/10;

		 }
		 if(temp==sum) {
			 return true;
		 }
		 else
		 	return false;
	}

}
