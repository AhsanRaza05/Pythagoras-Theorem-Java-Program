

import java.util.Scanner;
import static java.lang.System.out;

class Main{

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int hypoteneous = 0;
		
		System.out.print("\nPlease enter the value of Hypoteneous: ");
		hypoteneous = input.nextInt();
		
		out.println();

		int totalPossibleTriplets = 0;

		l1:for(int perpendicular = 0; perpendicular < hypoteneous; perpendicular++){
			
			for(int base = 0; base < perpendicular;base++){	
								
				if(Math.pow(hypoteneous,2) == (Math.pow(base,2) + Math.pow(perpendicular,2))){
				
				totalPossibleTriplets++;
				
				out.println("For TRIPLET # %d".formatted(totalPossibleTriplets));

				out.println("\tThe Value of Base = %d\n\tThe value of Perpendicular = %d\n".formatted(base,perpendicular));

				//break l1;
			}
			}
			
		}

		out.print("Total no. of Possible triplets = %d\n".formatted(totalPossibleTriplets));
		
		
	}
}