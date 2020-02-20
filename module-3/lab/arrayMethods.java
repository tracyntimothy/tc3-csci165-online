package arrayMethods;

import java.io.FileReader;
import java.lang.System;
import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedReader;
//import java.util.Collections;
//import java.io.FileNotFoundException;
//import java.lang.Object;
//import java.util.Scanner;
//import java.io.File;
//import java.io.Writer;
//import java.io.OutputStreamWriter;
//import java.io.FileWriter;
//import java.io.FileReader;
//import java.io.InputStreamReader;


public class arrayMethods {

	
	public static void fillArray (int[] myArray, String fileName) {
		try {
			
			String numberFile = fileName;
			BufferedReader br = new BufferedReader(new FileReader(numberFile));
			
			for (int i = 0; i < 1000; i++) {
				myArray[i] = Integer.parseInt(br.readLine());
			}//end fillArray for 
		br.close();		
			}//end fillArray try
			
			catch(IOException e) {
				System.out.println("Houston, we have a problem!!!");
			}//end fillArray catch
		 
		}//end fillArray static method
	
		
	public static int findMax(int[] myArray) {
		
		Arrays.sort(myArray);
				int arrayLength = myArray.length;
		
		System.out.println("The largest value is: "+ (myArray[arrayLength-1]));
		return myArray[arrayLength-1];	
		
	}//end findMax method
	
	public static int findMin(int[] myArray) {
		
		Arrays.sort(myArray);
			
		System.out.println("The smallest value is: " + myArray[0]);
		return myArray[0];
	}//end findMin method
	
	public static int range(int[] myArray) {
		int arrayRange = findMax(myArray) - findMin(myArray);
		System.out.println("The range of the array is: " + arrayRange);
		
		return arrayRange;
	}//end range method
	
	public static void percentChange(int[] myArray, double[] change) {
		
		for (int i = 0; i < 999; i++) {
			change[i] = ((myArray[i+1]- myArray[i]) / (double)myArray[i]) * 100;
			
			
			}//end percentChange for
		int len = myArray.length;
		  if (len > 0) {
		    myArray[0] = 0;
		  }//end if
		  
		
			
		}//end percentChange method
	
	
		public static void main(String[] args ) {
			
			int [] myArray = new int [1000];
			double[] pChange = new double [999];
			double change = 0;
			String fileName = "number_list.txt";
			int arrayRange = 0;
			
						
			fillArray(myArray, fileName);
			
			arrayRange = range(myArray);//array myArray has been sorted ascending, easy to find range
			
			//System.out.println("Array range = " + arrayRange);
			
			percentChange(myArray, pChange); //array myArray has been sorted ascending
			
			Arrays.fill( myArray, 0);//reset array myArray
			fillArray(myArray, fileName);//refill myArray from file
			for (int i=0; i <1000; i++) {
				
				if(i == 999) {
					change = (((myArray[999]- myArray[998])/ (double)myArray[998])*100);//we know the position in this case (999)
					System.out.printf("%s%d \t%s%d \t%s%.2f%c\n ", "Array Index# ", i, "Array value = ", myArray[i], "% Change= ", change, '%');
				}//end main if
				
				else {
					change = pChange[i];
				System.out.printf("%s%d \t%s%d \t%s%.2f%c\n", "Array Index# ", i, "Array value = ", myArray[i], "% Change = ",  change, '%');
				}//end else
			}//end for
	}//end of main
		
	}//end of class



