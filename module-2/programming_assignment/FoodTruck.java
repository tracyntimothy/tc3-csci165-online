import java.lang.System;
import java.lang.Object;
import java.util.Scanner;
import java.io.File;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FoodTruck{

    public static void main(String[] args) throws IOException{
        int i = 0;
        ArrayList <String> priceList = new ArrayList<String>( 3 );
        try (BufferedReader br = new BufferedReader (new FileReader ("prices.txt"))){
            while (br.ready()){
                priceList.add(br.readLine());
                i = ++i;
            }
        }
        System.out.println( priceList );
        System.out.println( "priceList item counter = " + i );

        int j = 0;
        ArrayList <String> menuList = new ArrayList<String>( 3 );
        try (BufferedReader br = new BufferedReader (new FileReader ("menu.txt"))){
            while (br.ready()){
                menuList.add(br.readLine());
                j = ++j;
            }
             br.close();
        }

            System.out.println( menuList );
            System.out.println( "menuList item counter = " + j);

            System.out.println("Welcome to the CS food truck");
            System.out.print("Enter your name: ");

        Scanner nameIn = new Scanner(System.in);
        String name = nameIn.nextLine();
        int k = 0;
        nameIn.close();
        ArrayList <String> orderList = new ArrayList<String>(3);   

            System.out.println("name is: " + name );
            System.out.println("Hi, please enter the quantity for each menu item to be added to your order.");
            Scanner orderIn = new Scanner (System.in);
            
            for ( int l = 0; l < menuList.size(); /*l++*/){
                //int l = 0;
                System.out.print(menuList.get(l) + " - " + priceList.get(l) +  " : ");

                //}
                //while (orderIn.hasNext()){
                String userOrder = orderIn.next();
                
                    orderList.add(0, userOrder);
                    l++;}
                //System.out.println(userOrder);
                //}

                System.out.println("User Order is: " + orderList);
                 /* while (orderIn.hasNext()) {

                     orderList.add(orderIn.nextLine());
                     }                  
                    System.out.print( orderList);*/
                    //System.out.println("orderList item counter =" + k );
             //                               }
        
            }//end of main
        }//end of class