package program_elseif;

public class DEMO1 {

	public static void main(String[] args) {
		int age = 18;
		if(age<=17) {
			System.out.println("You are not eligible for Voting");
		}else if(age==20) {
			System.out.println("Your age is 18");
		}else {
			System.out.println("You are eligible for vote");
		}
		

	}

}
