package Esercizio_1;

public class StringUtils {
	
	public String concatenate (String a , String b) {
		return a + b;
	}
	
	public boolean isPalindrome ( String str ) {
		String reversed = new StringBuilder(str).reverse().toString();

		return str . equals ( reversed ) ;
	}
}
