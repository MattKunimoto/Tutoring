import java.util.*;

public class MidtermPractice2{
	public static void main(String[] args){

		System.out.println(addNumbers(4,3));
		System.out.println(anglePairs(0,90,180));
		System.out.println(anglePairs(45,135,45));
		xo(5);
		xo(9);
	}

	public static int addNumbers(int a, int b){
	// IN: two integers
	// OUT: their sum

		int sum = a + b;
		return sum;
	}

	public static void xo(int size){
	// IN: size of square array
	// prints out a square array of o's with x's along the diagonals

		for(int row = 0; row < size; row++){
			for(int column = 0; column < size; column++){
				if(row==column || column==(size-1-row)){
					System.out.print("x");
				}
				else{
					System.out.print("o");
				}
			}
			System.out.println();
		}
	}

	public static boolean anglePairs(int a, int b, int c){
	// IN: three integer angles
	// OUT: boolean of whether any are complementary or supplementary with each other

		boolean hit = false;

		if(a + b == 90 || a + b == 180)
			hit = true;
		if(b + c == 90 || b + c == 180)
			hit = true;
		if(a + c == 90 || a + c == 180)
			hit = true;

		return hit;
	}
}