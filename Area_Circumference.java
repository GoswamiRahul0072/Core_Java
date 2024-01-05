package program_elseif;

import java.util.Scanner;

public class Area_Circumference {

	public static void main(String[] args) {
		double r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the value of radius:");
		r = sc.nextDouble();
		double pi= 3.14;
		double area= pi*r*r;
		double perimeter = 2*pi*r;
		
		System.out.println("The Value Area of Circle is:"+area);
		System.out.println("The Value Perimeter of Circle is:"+perimeter);
		

	}

}
