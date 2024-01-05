package program_elseif;

import java.util.Scanner;

public class Age_Greater_Smaller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int User1,User2,User3;
		System.out.println("Enetr the First User Age:");
		User1 = sc.nextInt();
		System.out.println("Enetr the Second User Age:");
		User2 = sc.nextInt();
		System.out.println("Enetr the Third User Age:");
		User3 = sc.nextInt();
		
		if(User1>User2 && User1>User3) {
			System.out.println("The Age of User is Greatest:"+User1);
		}else if(User2>User1 && User2>User3) {
			System.out.println("The Age of User is Greatest:"+User2);
		}else {
			System.out.println("The Age of User is Greatest:"+User3);
		}
		
		if(User1<User2 && User1<User3) {
			System.out.println("The Age of User is Lowest:"+User1);
		}else if(User2<User1 && User2<User3) {
			System.out.println("The Age of User is Lowest:"+User2);
		}else {
			System.out.println("The Age of User is Lowest:"+User3);
		}

	}

}
