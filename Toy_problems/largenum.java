import java.util.*;
public class largenum {
	public static void main(String[] args) {
		 System.out.print("How many numbers do you want to enter? ");
	        Scanner sc=new Scanner(System.in);
	        int count=sc.nextInt();

	        int smallest=Integer.MAX_VALUE;
	        int largest=Integer.MIN_VALUE;

	        for(int i=1;i<=count;i++){
	            System.out.println("Number" + i + ": ");
	            int nextNumber=sc.nextInt();
	            if(nextNumber<smallest){
	                smallest=nextNumber;
	            }
	            else if(nextNumber<largest){
	                largest=nextNumber;
	            }


	        }
	        System.out.println("Smallest= "+ smallest);
	        System.out.println("Largest= "+ largest);

    }
}

