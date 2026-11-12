package chapter_4;
/*4.11(Binary to decimal) Write a program that prompts the user to enter binary 
digits and displays its corresponding decimal value.  */
import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary digits (0000 to 1111): ");
        String binary = sc.nextLine();

        int decimalValue = 0;
        //Check each placeholder of binary 
        char letterCheck;
        letterCheck = binary.charAt(0);
        if(letterCheck == '1')
            decimalValue += 8;

        letterCheck = binary.charAt(1);
        if(letterCheck == '1')
            decimalValue += 4;

        letterCheck = binary.charAt(2);
        if(letterCheck == '1')
            decimalValue += 2;

        letterCheck = binary.charAt(3);
        if(letterCheck == '1')
            decimalValue += 1;

        //Display the results
        System.out.println("The decimal value is "+decimalValue);
    }
}
