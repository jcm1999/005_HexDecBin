import java.util.Scanner;

public class HexDecBin {
	
	/*
	 * FIX FAULTS! COMPLETE MISSING CODE!
	 */
	
	//Scanner for float is now working
	private Scanner kbd = new Scanner(System.in);
	private String name = "";
	private String hex = "";
	private String dec = "";
	private String bin = "";
	private String starting = "";
	private String type = "";
	private String convertTo = "";
	private int num;
	private boolean again = true;
	
	
	public HexDecBin() {
		System.out.println("Welcome to my Hexadecimal, Decimal, or Binary conversion program!");
		System.out.println("What is your name?");
		name = kbd.nextLine();
		System.out.println("Very nice to meet you " + name + " let's begin : \n");
	}
	
	public void setHexNumber() {
		while(again == true) {
		System.out.println("What is your starting base Hex, Dec, or Bin?");
		String starting = kbd.nextLine();
		if(starting.equalsIgnoreCase("hex")) {
			type = "hex";
		}
		else if(starting.equalsIgnoreCase("dec")) {
			type = "dec";
		}
		else if(starting.equalsIgnoreCase("bin")) {
			type = "bin";
		}
		else {
			
		}
		System.out.println("What base do you want to convert to Hex, Dec, or Bin?");
		starting = kbd.nextLine();
		if(starting.equalsIgnoreCase("hex")) {
			convertTo = "hex";
		}
		else if(starting.equalsIgnoreCase("dec")) {
			convertTo = "dec";
		}
		else if(starting.equalsIgnoreCase("bin")) {
			convertTo = "bin";
		}
		else {
			
		}
		System.out.println("\nWhat is your input number?");
		//starting = kbd.nextLine();
		if(type.equalsIgnoreCase("hex")) {
			hex = kbd.nextLine();
			convert(hex, convertTo);
		}
		else if(type.equalsIgnoreCase("dec")) {
			dec = kbd.nextLine();
			convert(dec, convertTo);
		}
		else if(type.equalsIgnoreCase("bin")) {
			bin = kbd.nextLine();
			convert(bin, convertTo);
		}
		else {
			
		}
		System.out.println("Would you like to do another? (y/n)");
		starting = kbd.nextLine();
		if(starting.equalsIgnoreCase("y")) {
			again = true;
		}
		else if(starting.equalsIgnoreCase("n")) {
			again = false;
			System.out.println("OK, see ya!");
		}
		else {
			
		}
		}
		// mouse over parseInt to read pop-up guide
		
		
	}
	
	public void convert(String start, String stop) {
		if(type.equalsIgnoreCase("hex")) {
			if(stop.equalsIgnoreCase("dec")) {
				num = Integer.parseInt(start, 16);
				System.out.println("Decimal value is: " + num + " (remember 0-" + num + " has " + (num+1) + " values)");
			}
			else if(stop.equalsIgnoreCase("bin")) {
				num = Integer.parseInt(start, 16);
				String holder = Integer.toBinaryString(num);
				System.out.println("Binary value is: " + holder);
			}
			else {
				
			}
		}
		else if(type.equalsIgnoreCase("dec")) {
			if(stop.equalsIgnoreCase("hex")) {
				num = Integer.parseInt(start);
				String holder = Integer.toHexString(num);
				System.out.println("Hex value is: " + holder);
			}
			else if(stop.equalsIgnoreCase("bin")) {
				num = Integer.parseInt(start);
				String holder = Integer.toBinaryString(num);
				System.out.println("Binary value is: " + holder);
			}
			else {
				
			}
		}
		else if(type.equalsIgnoreCase("bin")) {
			if(stop.equalsIgnoreCase("hex")) {
				num = Integer.parseInt(start, 2);
				String holder = Integer.toHexString(num);
				System.out.println("Hex value is: " + holder);
			}
			else if(stop.equalsIgnoreCase("dec")) {
				num = Integer.parseInt(start, 2);
				System.out.println("Decimal value is: " + num + " (remember 0-" + num + " has " + (num+1) + " values)");
			}
			else {
				
			}
		}
		else {
			
		}
		/*
		num = Integer.parseInt(hex, 16);
		System.out.println("You have entered hex " + hex );
		System.out.println("Decimal value is: " + num + " (remember 0-" + num + " has " + (num+1) + " values)");
		
		String binary = Integer.toBinaryString(num);
		int nibbles = binary.length()/4;
		int nrem = binary.length()%4;
		int bytes = binary.length()/8;
		int brem = binary.length()%8;
		System.out.println("Binary value is: " + binary);
		System.out.println("Number of bits is " + binary.length());
		System.out.println("Number of whole nibbles (4 bits) is " + nibbles + " with " + nrem + " bits left over");
		System.out.println("Number of whole bytes (8 bits) is " + bytes + " with " + brem + " bits remaining");
		*/
	}

}
