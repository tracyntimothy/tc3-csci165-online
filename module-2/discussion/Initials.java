import java.util.Scanner;
import java.lang.System;
import java.lang.String;


class Initials {

	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your first and last name separated by a space: ");
			//collect the name string from the user
			String name = input.nextLine();
			//Find the first letter of the first name at position 0 in the string name
			char firstInit = name.charAt(0);
			//Find the index of the position of the space in the name string
			int indexSpace = name.indexOf(" ");
			//Find the position of the first initial of the last name, one after the space
			char lastInit = name.charAt(indexSpace + 1);
			//Find the position index as an integer of the first initial of the last name
			int indexLast = indexSpace + 1;
			//Find unicode of first initial
			int unicodeFirst = name.codePointAt(0);
			//Fimd unicode of last intitial
			int unicodeLast = name.codePointAt(indexLast);
			//calculate the sum of the unicode values for first and last initial
			int sumUnicodeFirstLast = unicodeFirst + unicodeLast;
			
			//Provide output to the terminal
			System.out.println("Your 1st initial of your first name is: " + firstInit);
			System.out.println("Your 1st initial of your last name is: " + lastInit);
			System.out.println("The Unicode value of '" + firstInit + "' is: " + unicodeFirst);
			System.out.println("The Unicode value of '" + lastInit + "' is: " + unicodeLast);
			System.out.println("The sum of the Unicode values for your initials is: " + sumUnicodeFirstLast);
			System.out.println("Your intitials are: " + firstInit + lastInit);

			

	}//end of main

}//end of class