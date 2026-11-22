package chapter_4.exercises;
/*4.12 (Hex to binary) Write a program that prompts the user to enter a hex digit and display
its corresponding binary number in four digits. For example, hex digit 7 is 0111 in binary. Hex
digts can be entered either in uppercase or lowercase.  */
import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args){
        //Prompt the user to enter a hex digit
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexDigit = sc.nextLine();
        String checkHexDigit = hexDigit.toLowerCase();

        //Use a switch statement to handle all fo the hex digits
        int remainingValue = 0;
        String binary = "";
        switch(checkHexDigit){
            case "1":

            case "2":
            case "3":
            case "4":
            case "5":    
            case "6":
            case "7":
            case "8":
            case "9":
               remainingValue = Integer.parseInt(hexDigit); break;
            case "a": remainingValue = 10; break;
            case "b": remainingValue = 11; break;
            case "c": remainingValue = 12; break;
            case "d": remainingValue = 13; break;
            case "e": remainingValue = 14; break;
            case "f": remainingValue = 15; break;
            default:
                System.out.println(hexDigit + " is an invalid input");
        }

        if ((remainingValue - 8) >= 0) {      
            remainingValue -= 8;
            binary += "1";
        } else if (remainingValue == 0) {
            binary += "0";
        } else if ((remainingValue - 8) < 0) {
            binary += "0";
        }

        if ((remainingValue - 4) >= 0) {       
            remainingValue -= 4;
            binary += "1";
        } else if (remainingValue == 0) {
            binary += "0";
        } else if ((remainingValue - 4) < 0) {
            binary += "0";
        }

        if ((remainingValue - 2) >= 0) {       
            remainingValue -= 2;
            binary += "1";
        } else if (remainingValue == 0) {
            binary += "0";
        } else if ((remainingValue - 2) < 0) {
            binary += "0";
        }

        if ((remainingValue - 1) >= 0) {       
            remainingValue -= 1;
            binary += "1";
        } else if (remainingValue == 0) {
            binary += "0";
        } else if ((remainingValue - 1) < 0) {
            binary += "0";
        }

        //Display the results
        System.out.printf("The binary value is %s", binary);

        
    }
}


