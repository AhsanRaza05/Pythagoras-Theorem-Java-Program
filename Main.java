

import java.util.Scanner;

class Main{

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int hypoteneous = 0;
		
		System.out.print("Please enter the value of Hypoteneous: ");
		hypoteneous = input.nextInt();
		
		l1:for(int base = 0; base < hypoteneous;base++){
			
		
			for(int perpendicular = 0; perpendicular < hypoteneous; perpendicular++){
				
								
				if(Math.pow(hypoteneous,2) == (Math.pow(base,2) + Math.pow(perpendicular,2))){
				
				System.out.println("The Value of Base = %d\nThe value of Perpendicular = %d".formatted(base,perpendicular));
				break l1;
			}
			}
			
		}
		
		
	}
}