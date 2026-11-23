package chapter_4.exercises;
/*4.14 (Convert letter grade to number) Write a program that prompts the user to enter a
letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2, 1, or 
0. For other input, display invalid grade */

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        String letter = sc.nextLine();

        //Use a switch statement to determine the results
        switch(letter){
            case "A": System.out.println("The numeric value is 4"); break;
            case "B": System.out.println("The numeric value is 3"); break;
            case "C": System.out.println("The numeric value is 2"); break;
            case "D": System.out.println("The numeric value is 1"); break;
            case "F": System.out.println("The numeric value is 0"); break;
            default: System.out.println(letter + " is an invalid"); break;
        }
    }    
}
