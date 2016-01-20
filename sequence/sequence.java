package sequence; //a package inside the class

import java.util.*; //imports all library files

public class sequence {

	public int [] sequence(int a, int b, int c) {
		
	
	int min  = Math.min(Math.min(a, b),c);
	int max  = Math.max(Math.min(a, b),c);
	int[] num={a,b,c};
	int[] numbers = 0;
	Arrays.sort(numbers);
	System.out.println(Arrays.toString(numbers));
	return numbers;
	
	}
	
	
	
	public static void main(String[] args) {
		sequence num = new sequence();
		 num.sequence(4, 8, 10);
		 num.sequence(4, 14, 10);
		 

	}

}
