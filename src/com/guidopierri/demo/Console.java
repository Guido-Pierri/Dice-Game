package com.guidopierri.demo;

import java.util.Scanner;

public class Console {

    public void pressAKey(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Press Enter to continue");
        scan.nextLine();

    }
    public String returnString(){
        Scanner scan = new Scanner(System.in);
        boolean validStr;
        do {

            while (scan.hasNextInt())
            {
                System.out.println("You entered an invalid character, try again");
                scan.next();
            }
            validStr = true;
        }while (validStr == false);

        return scan.nextLine();
    }
    public int returnInt(){

        Scanner scan = new Scanner(System.in);
        boolean validTheStringParsed = false;
        int theStringParsed = 0;
        do {

            String theStringTyped = scan.nextLine();
            try {
                theStringParsed = Integer.parseInt(theStringTyped);
                if (theStringParsed > 0)
                    validTheStringParsed = true;
                else {
                    System.out.println("You didn't enter a positive number, try again");}
            }catch (Exception e){
                System.out.println("You didn't enter a number, try again");
            }
        }while (validTheStringParsed == false);
        return theStringParsed;
    }
    public int integer1to5(){
        Scanner scan = new Scanner(System.in);
        boolean validTheStringParsed = false;
        int theStringParsed = 0;
        do {

            String theStringTyped = scan.nextLine();
            try {
                theStringParsed = Integer.parseInt(theStringTyped);
                if (theStringParsed >= 1 && theStringParsed <=5)
                    validTheStringParsed = true;
                else {
                    System.out.println("You didn't enter a number between 1 and 5, try again");}
            }catch (Exception e){
                System.out.println("You didn't enter a number, try again");
            }
        }while (validTheStringParsed == false);
        return theStringParsed;
    }
    public int integer1to2(){
        Scanner scan = new Scanner(System.in);
        boolean validTheStringParsed = false;
        int theStringParsed = 0;
        do {

            String theStringTyped = scan.nextLine();
            try {
                theStringParsed = Integer.parseInt(theStringTyped);
                if (theStringParsed >= 1 && theStringParsed <=2)
                    validTheStringParsed = true;
                else {
                    System.out.println("You didn't enter a number between 1 and 2, try again");}
            }catch (Exception e){
                System.out.println("You didn't enter a number, try again");
            }
        }while (validTheStringParsed == false);
        return theStringParsed;
    }
}