/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        int q;
        
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Please give the month of your BIRTH as a number");  //prompt the user for a birth month
        //your birth month variable = keys.nextInt();
        q = keys.nextInt();
        keys.close();
        
        //determine the number of days in the user's birth month
        if (q==1||q==3||q==5||q==7||q==8||q==10||q==12){
            System.out.println("The month of your BIRTH has 31 days");
        }
        else if (q==4||q==6||q==9||q==11){
            System.out.println("The month of your BIRTH has 30 days");
        }
        else if (q==2){
            System.out.println("the month of your BIRTH has either 28 or 29 days");
        }
        
        //output the result to the user
        System.out.println("HAPPY BIRTHDAY!");
    }
}