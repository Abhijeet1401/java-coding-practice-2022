public class StringPalindrome {
	public static void main(String[]args){
		System.out.println(checkPalindrome("eovbgggijqjdsdhjyojeaujcdyyyxtpjlllowjyarfhxjxwkxpranhtlucoklahtokmqyozlrwhldozgbgpalkqlcsiowyeslusn"));
		
	}
	public static boolean checkPalindrome(String str){
		 int i=0;
		 int j = str.length()-1;
       while(i<=j){
       	  if(str.charAt(i)!=str.charAt(j)){
       	  	return false;
          }else{
       	  	i++;
       	  	j--;
       	  }
       }
       return true;
	}
}
