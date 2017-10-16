import java.util.Scanner;

public class BinPower {
	//Fixed Scanner bug for float inputs
	
	Scanner input = new Scanner(System.in);

	/*
	 * String is cap'd reason is because it is a class
	 * int is not cap'd reason is because it is "primitive" not a Class
	 */
	
	public BinPower() {
		
	}
	
	public void setBinary() {
		
		
		
		// 2**2 does not work, differs from Python, got an error msg
		
		double base;
		double exp;
		int ans = 0;
		double answer;
		String name = "";
		
		//ans = 2*2
		// 2**2 does not work, differs from Python, got an error msg
		
		//ans = 2^2;
		//System.out.println("Answer is: " + ans);
		// does not work - yet, no error msg
		
		System.out.println("Hello most amazing Java student! What is your name?");
		name = input.nextLine();
		System.out.println("Welcome to my program " + name + ".");
		
		System.out.println("What base number do you want to enter?: ");
		base = input.nextDouble();
		System.out.println("You have entered: " + base);
		
		System.out.println("What binary exponent do you want to enter?: ");
		exp = input.nextDouble();
		System.out.println("You have entered: " + exp);
			
		//don't need!!!!!!!!
		// Mth myMath = new Math();
		// because it is "static" -- means just use it!
		
		// (int) "Type Casting" -- pow requires double, which makes no sense in binary
		// so type cast to the correct answer
		answer = Math.pow(base, exp);
		System.out.println("Answer is: " + answer);
	}
}
