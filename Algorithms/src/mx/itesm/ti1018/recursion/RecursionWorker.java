package mx.itesm.ti1018.recursion;

public class RecursionWorker {
	
	
	////Palindrome Function
	public static boolean isPalindrome(String str){
		String restOfStr = null;
		str = str.toLowerCase().replaceAll("\\s","");
		
		//Basic cases
		if (str.length() <= 1)
			return true;
		else if (str.length() > 1) {
			if(str.substring(0,1).equals(str.substring(str.length() - 1, str.length()))){
				restOfStr = str.substring(1, str.length()-1);				
				return isPalindrome(restOfStr);
			}
			else
				return false;
		}
		
		return false;
	}
	
	
	
	////POWER FUNCTION
	//// NOTE: Handling recursion with returns
	public static int power(int base, int exp){
		if(base == 1){
			//base
			return base;
		} else if(exp == 0){
			//base
			return 1;
		}else{
			//recursive case
			return base * power(base, exp -1);
		}		
	}
	
	
	
	public static void printBinary_A(int n) {
		
		if(n < 0) {
			System.out.println("-");
			// This is crazy
		}
		else if(n < 2) {
			System.out.print(n);
		}
		else {
			int lastDigit = n % 2;
			int restOfNumber = n/2;
			printBinary_A(restOfNumber);
			printBinary_A(lastDigit);
		}
		
		
	}
	
	
	
	
	
	
	
	/// isBinary 
	public static void printBinary(int n){
		//base case
		if(n < 2)
			System.out.print(n);
		else{
			int lastDigit = n % 2;
			int restOfDigits = n / 2;
			printBinary(restOfDigits);
			printBinary(lastDigit);
		}
				
	}
	
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			// MAGIC 
			
			return n * factorial(n -1) ;
		}
	}
	
	public static void printStar(int n) {
		if(n == 1) {
			System.out.print("*");			
		}
		else {
			/// Magic_function();
			System.out.print("*");
			printStar(n-1);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/////TEST POWER
//		System.out.println(power(10, 2));
//		System.out.println(power(5, 4));
//		System.out.println(power(2, 10));
//		System.out.println(power(3, 4));
//		System.out.println(power(0, 2));

		///Test Palindrome
//		System.out.println(isPalindrome("annia"));
//		System.out.println(isPalindrome("anita lava la tina"));
//		System.out.println(isPalindrome("anna lala"));
//		System.out.println(isPalindrome("anna"));
//		System.out.println(isPalindrome("anna"));
//		
		

		/*
		 * ///Test printStar(n) printStar(1); System.out.println(""); //printStar(12);
		 * //System.out.println(""); printStar(3); System.out.println(""); printStar(6);
		 * System.out.println(""); printStar(4);
		 */
		
		printBinary_A(10);
		System.out.println();
		printBinary_A(-12);
		
		
		

	}
	
	

}
