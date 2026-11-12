package chapter_4.exercises;
import java.util.Scanner;
/*4.8(Find the character of an ASCII code) Write a program that receives a character
and displays its ASCII code (an integer between 0 and 127). */

public class exercise8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Prompt the user to enter a character
        System.out.print("Enter a character: ");
        String test = sc.nextLine();

        //Convert the string into a char
        char testChar = test.charAt(0);
        int unicode = (int)(testChar);

        //Display the results
        System.out.printf("The ASCII code for character %c is %d", testChar, unicode);
    }    
}
