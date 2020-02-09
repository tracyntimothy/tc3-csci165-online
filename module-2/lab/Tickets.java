import java.lang.Math;
import java.lang.Integer;
import java.lang.Object;
import java.lang.System;
import java.util.Scanner;
import java.io.File;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Tickets{

    public static void main(String[] args) throws IOException{
        /* 
            The following code steps you through the String processing
            and math neccessary to determine if a single ticket number is valid.
            Your job with this code is to:

            ~   Closely study the code. Reverse engineer it. Use the API for guidance
                to understand the classes and methods that are being used.
            ~   Add comments for each statement, describing in detail what the line is doing
                I want to know DETAILS, not generalizations. RESEARCH!
            ~   When you have completed that, add code to complete the following

                1) Using a Scanner, open the file: tickets.txt
                2) Using a while(hasNext) loop, read each ticket number
                3) Run the ticket number through the provided math and String processing
                4) If the ticket number is valid write it to a new file called: valid_tix.txt
                5) Ignore the invalid ticket numbers

            ~   Additional code must also be commented. But I am more interested in why you are doing
                something, not the details of how.

            Check your work: There are 101 valid ticket numbers among the 1000 provided ticket numbers
                             These people make mistakes!!!

            Submit only Java source code files. Also submit valid_tix.txt */

        /*Open a new Scanner named "scanner" which opens file named "ticket.txt".
        ------------------------------------------------------------------------------------------------
        THIS PREPARES TO READ THE SOURCE FILE WITH THE TICKET NUMBER LIST*/

        Scanner scanner = new Scanner(new File("tickets.txt"));

        /*Tells the scanner to use the line return or next line characters as delimiters
        ------------------------------------------------------------------------------------------------
        THIS LETS THE SCANNER KNOW THE FORMAT OF THE FILE AND HOW TO TELL IF A TICKET NUMBER IS FINISHED*/

        scanner.useDelimiter("[\r\n]");    
        
        /*Tells the scanner that more instructions are coming once it has read the first String value
        ------------------------------------------------------------------------------------------------
        THIS SETS UP THE STRUCTURE FOR ALL OF THE TRANSFORMATIVE STEPS OF THE CODE*/

            while (scanner.hasNext()) {

         /* Asign the value "12345" to a variable of type String named "ticket".
        -----------------------------------------------------------------------------------------------------------
        THIS IS THE COMPLETE TICKET NUMBER TO CHECK FOR VALIDITY*/

                String  ticket  = scanner.next(); 

                /*System.out.println("String 'ticket' value is: " + ticket ); **THIS WAS USED FOR TESTING AND DEBUG                           
                TO SEE THE VALUE OF THE STRING VARIABLE "ticket" AT THIS STAGE OF THE PROCESS*/

        /* ticket.length() determines the integer value of the length of the String "ticket" (which is equal to 6).  
        We then subtract 1 from the integer length (this is equal to 5).  ticket.substring returns the String value
        of the specified substring (which is the first 5 characters of the string, or 12345).  Lastly, the value of 
        "12345" is placed into the variable of type String named "last". 
        ------------------------------------------------------------------------------------------------------------
        THIS IS DONE TO FIND THE SUBSTRING THAT OMITS THE LAST DIGIT OF THE TICKET NUMBER SO THAT WE CAN PERFORM THE 
        VALIDITY TEST CALCULATION*/

                String last = ticket.substring(ticket.length() - 1); 

        /* Integer.valueOf(last) returns the Integer value of the String contained in variable "last".  This integer
        value (which is equal to 4) is then placed in a variable of type int (integer) named "last_digit".
        ------------------------------------------------------------------------------------------------------------
        THIS IS DONE TO FIND THE VALUE OF THE LAST DIGIT OF THE TICKET NUMBER TO BE USED IN THE TICKET VALIDITY TEST
        CALCULATION */

                int     last_digit = Integer.valueOf(last);

        /*ticket.length() provides the length of the String "ticket" as an integer (equals 6), then the integer is 
        decremented by 1 (equals 5).  ticket.substring returns the substring from string index position 0 (populated
        by "1") and ending at string index position 5.  This returns the substring value of "12345" (string index 
        positions 0 through 4).  The substring value of "12345" is added to variable of type String named 
        "reduced_ticket".
        ------------------------------------------------------------------------------------------------------------
        WE DO THIS TO FIND THE TICKET NUMBER MINUS THE REMAINDER NUMBER TO BE USED IN THE TICKET VALIDITY TEST 
        CALCULATION*/

                String  reduced_ticket = ticket.substring(0, ticket.length() - 1);

        /*Integer.valueOf returns an Integer object holding the value of the named String "reduced_ticket" (which is
         equal to the String value "12345").  The variable of type int (integer) named "ticket_number" is assigned 
         the integer value "12345".
        ------------------------------------------------------------------------------------------------------------
        THIS CONVERTS THE STRING VALUE OF "12345" (ONE, TWO, THREE, FOUR, FIVE) TO AN INTEGER VALUE OF 
        "12345" (Twelve thousand, Three Hundred, Forty Five) THAT CAN BE USED IN THE TICKET VALIDITY CALCULATION*/
        
                 int     ticket_number = Integer.valueOf(reduced_ticket);

        /*The remainder of mathematical operation of the int variable named "ticket_number" (value of "12345") Modulo
        "7" is assigned to the variable of type int (integer) named "remainder" (equal to 4).
        -------------------------------------------------------------------------------------------------------------
        THE MODULO OPERATION IS PERFORMED ON THE INTEGER VALUE OF THE TICKET NUMBER.*/

                 int     remainder = ticket_number % 7; 

        /*The variable of type int (integer) named "last_digit" (value 4) is compared to the variable of type int 
        (integer) named "remainder" (value 4) to see if they are equal values.  The result of the comparison is stored
        in the variable of type boolean named "validity" (value of "true").
        -------------------------------------------------------------------------------------------------------------
        THE LAST DIGIT OF THE TICKET NUMBER IS COMPARED TO THE REMAINDER OF THE MODULO OPERATION TO SEE IF THEY ARE 
        THE SAME.*/

                boolean validity = remainder == last_digit; 

        /*This sets the line headers and the format for the subsequent printf statement: "Original Ticket #:" will be
        followed by the value of a variable formatted as String, followed by a line return. "Last Digit: " will be 
        followed by the value of a variable formatted as a decimal integer, followed by a line return, "Reduced Ticket #:"
        will be followed by the value of a variable formatted as a decimal integer, followed by a line return, "Remainder:"
        will be followed by the value of a variable formatted as a decimal integer, followed by a line return, "Validity:"
        will be followed by the value of a variable formatted as boolean, followed by a line return.
        -------------------------------------------------------------------------------------------------------------
        THIS ARRANGES THE OUTPUT IN A READABLE FORMAT*/

                String  format = "Original Ticket #: %s\nLast Digit: %d\nReduced Ticket #: %d\nRemainder: %d\nValidity: %b\n";


        /*The values of the variables are printed to the termianl in the specified format.
        -------------------------------------------------------------------------------------------------------------
        THIS PRINTS THE OUTPUT TO THE TERMINAL*/

                System.out.printf(format, ticket, last_digit, ticket_number, remainder, validity);
               
        /*This begins a nested if-else tree to perform some actions if the value of the boolean variable "validity" is equal
        to "true".
        -------------------------------------------------------------------------------------------------------------
        THIS TESTS TICKET VALIDITY SINCE WE ONLY WANT TO USE VALID TICKET NUMBERS IN OUR NEW FILE*/

                if (validity == true)  {                   

        /*Here we try to create a new file named "valid_tix.txt" using a new FileWriter called "myWriter", we use a 
        nested if else to test for the presence of the file.  If the file does not already exist it is created. When
        it's created we send a useful message to the terminal. Else the file exists, it is not created, instead we 
        send a useful message to the terminal.
        -------------------------------------------------------------------------------------------------------------
        THE OUTPUT OF THE VALIDITY CALCULATIONS ARE WRITTEN TO A FILE NAMED "valid_tix.txt", IF IT DOESN'T EXIST IT IS CREATED*/

                    try {
                        File myWriter = new File("valid_tix.txt");
                        if (myWriter.createNewFile()){
                            System.out.println("File created: " + myWriter.getName());
                        }//end try if
                        else {
                            System.out.println("File already exists.");
                            }//end try else
                   }//end of try

        /* We need to catch any errors encountered in determining whether the file "valid_tix.txt" exists, or with opening
        the file. We invoke IOException error ("e") output using printStackTrace().
        -------------------------------------------------------------------------------------------------------------
        WE NEED TO SEE IF THERE IS ANY ISSUE WITH CREATING/OPENING THE FILE FOR THE OUTPUT*/

                    catch (IOException e) {
                        System.out.println("An error occurred with file valid_tix.txt.");
                            e.printStackTrace();
                    }//end catch

        /* We use FileWriter to write to the file "valid_tix.txt" using the boolean value "true" to append our write to the 
        end of the file.
        -------------------------------------------------------------------------------------------------------------
        WE TELL FileWriter OUR WRITE VALUE NEEDS TO BE APPENDED AT THE END OF THE FILE*/

                    FileWriter myWriter = new FileWriter("valid_tix.txt",true);

        /* We tell FileWriter to write the String value of the variable named "ticket", then we tell FileWriter to write a
        return line or next line character using System.lineSeparator().  Lastly we tell FileWriter to flush it's contents
        with "flush()".
        -------------------------------------------------------------------------------------------------------------
        WE TELL FileWriter WHAT VALUE TO WRITE TO THE FILE, THEN TO FOLLOW THAT WITH A LINE SEPARATOR.  LASTLY WE WANT TO 
        FLUSH THE CONTENTS OF FileWriter TO PREPARE IT FOR THE NEXT STRING */

                        myWriter.write(ticket);
                        myWriter.write(System.lineSeparator());
                        myWriter.flush();

        /* We print a useful message to the terminal stating that the value of variable "ticket" was successfully written
        to the file "valid_tix.txt", then get the next input from the scanner using "scanner.next()".
        --------------------------------------------------------------------------------------------------------------
        WE PRINT A MESSAGE TO THE TERMINAL LETTING US KNOW THE WRITE WAS SUCCESSFUL AND THEN MOVE ONTO THE NEXT INPUT
        FROM SCANNER */
                            System.out.println("Successfully wrote " + ticket +  " to the file.");
                        scanner.next();

                }//end if

        /* Else the validity of the ticket is "false", we print a useful message to the terminal, then take the next value 
        from the scanner using "scanner.next()".
        ---------------------------------------------------------------------------------------------------------------
        WE CHECK THE VALIDITY VALUE AND IT'S FALSE< SO WE PRINT A USEFUL MESSAGE TO THE TERMINAL SHOWING AN INVALID TICKET 
        WAS DETECTED, THEN TAKE THE NEXT VALUE FROM THE SCANNER "scanner" */

                 else {
                            System.out.println("Invalid Ticket " + ticket + " detected.");
                        scanner.next();
                }//end else
                

                }// end of while (scanner.hasNextString())
            // myWriter.close(); 
        scanner.close();// Close the Scanner "scanner"
         
    }//end of main
}//end of class

/*--------------------------------------------------------------------------------------------------------
HERE IS ALL OF THE CODE WITHOUT ANNOTATIONS:

import java.lang.Math;
import java.lang.Integer;
import java.lang.Object;
import java.lang.System;
import java.util.Scanner;
import java.io.File;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TicketsAnnotated{

    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(new File("tickets.txt"));        
            scanner.useDelimiter("[\r\n]"); 
             while (scanner.hasNext()) {
                String  ticket  = scanner.next();
                String last = ticket.substring(ticket.length() - 1); 
                int     last_digit = Integer.valueOf(last);
                String  reduced_ticket = ticket.substring(0, ticket.length() - 1);
                int     ticket_number = Integer.valueOf(reduced_ticket);
                int     remainder = ticket_number % 7;
                boolean validity = remainder == last_digit;
                String  format = "Original Ticket #: %s\nLast Digit: %d\nReduced Ticket #: %d\nRemainder: %d\nValidity: %b\n";
                System.out.printf(format, ticket, last_digit, ticket_number, remainder, validity);

                if (validity == true)  { 
                     try {
                        File myWriter = new File("valid_tix.txt");
                        if (myWriter.createNewFile()){
                            System.out.println("File created: " + myWriter.getName());
                        }
                        else {
                            System.out.println("File already exists.");
                            }
                        }
                     catch (IOException e) {
                        System.out.println("An error occurred with file valid_tix.txt.");
                            e.printStackTrace();
                    }
                    FileWriter myWriter = new FileWriter("valid_tix.txt",true);
                     myWriter.write(ticket);
                     myWriter.write(System.lineSeparator());
                     myWriter.flush();
                         System.out.println("Successfully wrote " + ticket +  " to the file.");
                    scanner.next();
                }
                else {
                            System.out.println("Invalid Ticket " + ticket + " detected.");
                        scanner.next();
                }
            }
            scanner.close();
        }
    }*/
