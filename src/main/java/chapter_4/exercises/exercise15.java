package chapter_4.exercises;
/*4.15 (Phone keypads) Write a program that prompts the user to enter a lowercase or
uppercase letter and displays its corresponding number. For a nonletter input, display 
invalid input */
import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        String letter = sc.nextLine();

        //need to take account if the user enters either an uppercase or lowercase letter
        String checkLetter = letter.toLowerCase();

        //Use a switch statement to handle the number mapping
        switch (checkLetter) {
            case "a", "b", "c":
                System.out.println("The corresponding number is 2");
                break;
            case "d", "e", "f":
                System.out.println("The corresponding number is 3");
                break;
            case "g", "h", "i":
                System.out.println("The corresponding number is 4");
                break;
            case "j", "k", "l":
                System.out.println("The corresponding number is 5");
                break;
            case "m", "n", "o":
                System.out.println("The corresponding number is 6");
                break;
            case "p", "q", "r", "s":
                System.out.println("The corresponding number is 7");
                break;
            case "t", "u", "v":
                System.out.println("The corresponding number is 8");
                break;
            case "w", "x", "y", "z":
                System.out.println("The corresponding number is 9");
                break;
            default:
                System.out.println(letter + " is an invalid input");

        }
    }
}