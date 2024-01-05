package program_elseif;

import java.util.Scanner;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second Number:");
		num2 = sc.nextInt();
		
		int Addition = num1+num2;
		int Subtrsction = num1-num2;
		int Multiplication = num1*num2;
		int Division = num1/num2;
		int Modulus = num1%num2;
		
		System.out.println("The addition of number is:"+Addition);
		System.out.println("The subtraction of number is:"+Subtrsction);
		System.out.println("The multiplication of number is:"+Multiplication);
		System.out.println("The division of number is:"+Division);
		System.out.println("The modulus of number is:"+Modulus);
		
	}

}
