import java.util.Scanner;
import java.lang.Math;
import java.lang.Integer;

class Primitives {

		public static void main(String[] args)  {
		//get ready to Take input from the keyboard
			Scanner input = new Scanner(System.in);


			//create variable of each primitive type and assign appropriate values
			byte typeByte = -42;
			short typeShort = 32767;
			int typeInt = 	-2147483648;
			long typeLong = 1234567891;
			float typeFloat = 12.12345f;
			double typeDouble = 7.62 - 5.56;
			boolean typeBoolean = true;
			char typeCharNum = 6;
			char typeCharNumLiteral = '6';
			char typeCharAlpha = 'A';

				//print the values of the primitive type to the terminal
				System.out.println("typeByte = " + typeByte);
				System.out.println("typeShort = " + typeShort);
				System.out.println("typeInt = " + typeInt);
				System.out.println("typeLong = " + typeLong);
				System.out.println("typeFloat = " + typeFloat);
				System.out.println("typeDouble = " + typeDouble);
				System.out.println("typeBoolean = " + typeBoolean);
				System.out.println("typeCharNum = " + typeCharNum);
				System.out.println("typeCharNumLiteral = " + typeCharNumLiteral);
				System.out.println("typeCharAlpha = " + typeCharAlpha);
	
		//prompt for integer input from keyboard
				System.out.println("Please enter an integer: ");
		//grab the input
		int line = input.nextInt();
			//perform calculations on input
			double square = Math.pow(line,2);
			double cube = Math.pow(line,3);
			double fourth = Math.pow(line,4);
				//Display results tot he terminal
				System.out.println("Your number squared is: " + square);
				System.out.println("Your number cubed is: " + cube);
				System.out.println("Your number to the power of four is: " + fourth);
	
		//Create two int variables one MAX one MIN
		int intA = Integer.MIN_VALUE;
		int intB = Integer.MAX_VALUE;
			//Print the values assigned to intA and intB to the terminal
			System.out.println("intA MIN_VALUE is: " + intA);
			System.out.println("intB MAX_VALUE is: " + intB);
		/*Show use of int compare and compareUnsigned compare signed will take into account
		  the number is positive or negative. The value 0 if intA == intB; a value less than 0 if
		  intA < intB as unsigned values; and a value greater than 0 if intA > intB as unsigned values
		*/	
		System.out.println("Compare signed = " + Integer.compare(intA, intB));
		System.out.println("Compare unSigned = " + Integer.compareUnsigned(intA, intB));
		
		//Collect Dividend and Divisor from keyboard input
		System.out.println("Please enter an integer for the dividend: ");
			int line1 = input.nextInt();
			int dividend = line1;
		System.out.println("Please enter an integer for the divisor: ");
			int line2 = input.nextInt();
			int divisor = line2;
		//Perform calculations for floor division and floor modulus

			System.out.println("Floor Division = " + Math.floorDiv(dividend,divisor));
			System.out.println("Floor Modulus  = " + Math.floorMod(dividend,divisor));
	}//end of main

}//end of class