import java.util.Scanner;
//import java.lang.Math;
//import java.lang.Integer;
//import java.lang.Object;
import java.lang.System;
import java.util.Formatter;
import java.util.Date;
import java.text.SimpleDateFormat;

class GMT {

		public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);
/*use the built-in java utility that measures "the difference
, measured in milliseconds" between the current time and 
midnight, January 1, 1970 UTC"*/
		int msHour = 3600000;
		long timeUtc = System.currentTimeMillis();
		/*Current System time is set to -5 GMT, so to get GMT
		 we need to alter the current system time*/
		long actualUtc = timeUtc + (msHour * 5);
	
		
		System.out.print("Input the time zone offset to GMT: ");
			//collect the GMT offset from the user
			int line = input.nextInt();
			int gmtOffset = line;
			//calculate the offset in milliseconds
			int offsetMs = gmtOffset * msHour;	
		/*This was used to to see input while determining calculations
		that needed to be performed on CurrentTimeMillis:
		System.out.println("CurrentTimeMillis in milliseconds = " + timeUtc);*/
		//format the time output
		SimpleDateFormat formatter= new SimpleDateFormat("'Current time is' HH:mm:ss ");
		//calculate GMT with the offset input
		Date date = new Date((actualUtc + offsetMs));	
		System.out.println(formatter.format(date));
		
		}//end of main

}//end of class
