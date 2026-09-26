package com.chapter_4;
import java.util.Scanner;

public class HexDigit2DexRevised {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = sc.nextLine();

        //Check if the hex string has exactly one character
        if (hexString.length() != 1){
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        //Display decimal value for the hex digit
        char ch = Character.toUpperCase(hexString.charAt(0));
        String chString = ch + "";
        if ('A' <= ch && ch <= 'F'){
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " 
                + chString.toLowerCase() + " is " + value);
        } 
        else if (Character.isDigit(ch)){
            System.out.println("The decimal value for hex digit "
                + chString.toLowerCase() + " is " + ch);
        }
        else {
            System.out.println(ch + " is an invalid input");
        }
    }
}
