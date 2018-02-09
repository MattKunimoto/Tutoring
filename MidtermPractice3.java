// MidtermPractice3.java
// Matthew Kunimoto
//
// More midterm practice examples for Brandon.


public class MidtermPractice3{
	public static void main(String [] args){

		// Testing our new method with different inputs
		System.out.println(areReversals("hello","goodbye"));
		System.out.println(areReversals("hello","olleh"));
		System.out.println(areReversals("HELLO","olleh"));
		System.out.println(areReversals("hello","aolleh"));
		System.out.println(areReversals("hello","ollehadfadf"));
		System.out.println(areReversals("yellow","wolley"));
		System.out.println(areReversals("yeLLow","wolleys"));				
	}



	public static boolean areReversals(String a, String b){
	// IN: two strings
	// OUT: boolean of if the strings are reversals of each other
	
		boolean reversal = true;	// boolean for keeping track of our checks

		// ignore case sensitivity
		a = a.toLowerCase();
		b = b.toLowerCase();

		// account for possible added characters on either end
		if(a.length() != b.length())
			reversal = false;

		// check chars in first string vs chars in second string (in reverse)
		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) != b.charAt(a.length() - 1 - i)){
				reversal = false;
			}
		}

		return reversal;
	}
}
