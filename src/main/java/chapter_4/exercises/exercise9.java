package chapter_4.exercises;
import java.util.Scanner;
/*4.9 (Find the Unicode of a character) Write a program that receives a character
and displays its Unicode. */
public class exercise9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Prompt the user to enter in a character
        System.out.print("Enter a character: ");
        String test = sc.nextLine();

        //Convert the character into corresponding Unicode decimal value
        char testChar = test.charAt(0);
        int unicode = (int)testChar;

        //Display the results
        System.out.printf("The Unicode for the character %c is %d\n",testChar, unicode);


    }
}
