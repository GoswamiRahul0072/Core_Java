package program_elseif;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = sc.nextInt();
		
		if(number % 2 == 0){
			System.out.println("The number you enter is Even number:"+number);
			
		}else {
			System.out.println("The number you enter is Odd number:"+number);
		}
		

	}

}
