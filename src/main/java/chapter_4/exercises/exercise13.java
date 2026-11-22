package chapter_4.exercises;
/*4.13 (Vowel or consonant) Write a program that prompts the
user to enter a letter and check whether the letter is a 
vowel or consonant. For a nonletter input, display invalid
inpput */
import java.util.Scanner;

public class exercise13 {
 public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    //Prompt the user to enter in a letter
    System.out.print("Enter a letter: ");
    String letter = sc.nextLine();

    //Use a switch statement to determine the results
    String checkLetter = letter.toLowerCase();
    switch(checkLetter){
      case "a", "e", "i", "o", "u": System.out.println(letter + " is a vowel"); break;    //intentional fall-through
      case "b", "c","d", "f", "g", "h", "j", "k", "l", "m", "n", "p","q","r","s","t","v","w","x","y","z":   //intentional fall-through
         System.out.println(letter + " is a consonant");break;
      default: System.out.println(letter + " is an invalid input");
    }
 }   
}
