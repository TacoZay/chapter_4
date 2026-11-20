package chapter_4;
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
                //Convert the letter to the corresponding decimal value
                remainingValue = Integer.parseInt(hexDigit);
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) > 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) == 0){
                    binary += "1";
                } else if ((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) > 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) == 0){
                    binary += "1";
                } else if ((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) > 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) == 0){
                    binary += "1";
                } else if ((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) > 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) == 0){
                    binary += "1";
                } else if ((remainingValue - 1) < 0){
                    binary += "0";
                }

                //Display the results
                System.out.printf("The binary value is %s", binary);

                break;
            
            case "2":
                //Convert the letter to the corresponding decimal value
                remainingValue = Integer.parseInt(hexDigit);
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) > 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if(remainingValue == 0){
                    binary += "1";
                } else if ((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) > 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if(remainingValue == 0){
                    binary += "1";
                } else if ((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) > 0){       // at this point, can i still subtact to from the given remaining value?
                    remainingValue -= 2;
                    binary += "1";
                }else if(remainingValue == 0){
                    binary += "1";
                } else if ((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) > 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if(remainingValue == 0){
                    binary += "1";
                } else if ((remainingValue - 1) < 0){
                    binary += "0";
                }

                //Display the results
                System.out.printf("The binary value is %s", binary);
                break;
            
            case "3":
                //Convert the letter to the corresponding decimal value
                remainingValue = Integer.parseInt(hexDigit);
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) > 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) == 0){
                    binary += "1";
                } else if ((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) > 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) == 0){
                    binary += "1";
                } else if ((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) > 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) == 0){
                    binary += "1";
                } else if ((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) > 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) == 0){
                    binary += "1";
                } else if ((remainingValue - 1) < 0){
                    binary += "0";
                }

                //Display the results
                System.out.printf("The binary value is %s", binary);
                break;
            case "4":
                //Convert the letter to the corresponding decimal value
                remainingValue = Integer.parseInt(hexDigit);
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) > 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) == 0){
                    binary += "1";
                } else if ((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) > 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) == 0){
                    binary += "1";
                } else if ((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) > 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) == 0){
                    binary += "1";
                } else if ((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) > 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) == 0){
                    binary += "1";
                } else if ((remainingValue - 1) < 0){
                    binary += "0";
                }

                //Display the results
                System.out.printf("The binary value is %s", binary);
                break;
            
            case "5":
                //Convert the letter to the corresponding decimal value
                remainingValue = Integer.parseInt(hexDigit);
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) > 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) == 0){
                    binary += "1";
                } else if ((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) > 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) == 0){
                    binary += "1";
                } else if ((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) > 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) == 0){
                    binary += "1";
                } else if ((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) > 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) == 0){
                    binary += "1";
                } else if ((remainingValue - 1) < 0){
                    binary += "0";
                }

                //Display the results
                System.out.printf("The binary value is %s", binary);
                break;
            
            case "6":
                //Convert the letter to the corresponding decimal value
                remainingValue = Integer.parseInt(hexDigit);
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) > 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) == 0){
                    binary += "1";
                } else if ((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) > 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) == 0){
                    binary += "1";
                } else if ((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) > 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) == 0){
                    binary += "1";
                } else if ((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) > 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) == 0){
                    binary += "1";
                } else if ((remainingValue - 1) < 0){
                    binary += "0";
                }

                //Display the results
                System.out.printf("The binary value is %s", binary);
                break;

            case "7":
                //Check each placeholder to create the binary number
                remainingValue = Integer.parseInt(hexDigit);
                if((remainingValue - 8) >= 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) >= 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) >= 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) >= 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) < 0){
                    binary += "0";
                }

                //Display the results
                System.out.printf("The binary value is %s", binary);
                break;

            case "8":
               //Convert the letter to the corresponding decimal value
                remainingValue = Integer.parseInt(hexDigit);
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) > 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) == 0){
                    binary += "1";
                } else if ((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) > 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) == 0){
                    binary += "1";
                } else if ((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) > 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) == 0){
                    binary += "1";
                } else if ((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) > 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) == 0){
                    binary += "1";
                } else if ((remainingValue - 1) < 0){
                    binary += "0";
                }

                //Display the results
                System.out.printf("The binary value is %s", binary);
                break;

            case "9":
                //Convert the letter to the corresponding decimal value
                remainingValue = Integer.parseInt(hexDigit);
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) > 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) == 0){
                    binary += "1";
                } else if ((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) > 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) == 0){
                    binary += "1";
                } else if ((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) > 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) == 0){
                    binary += "1";
                } else if ((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) > 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) == 0){
                    binary += "1";
                } else if ((remainingValue - 1) < 0){
                    binary += "0";
                }

                break;

            case "a":
                //Convert the letter to the corresponding decimal value
                remainingValue = 10;
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) > 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) == 0){
                    binary += "1";
                } else if ((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) > 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) == 0){
                    binary += "1";
                } else if ((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) > 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) == 0){
                    binary += "1";
                } else if ((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) > 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) == 0){
                    binary += "1";
                } else if ((remainingValue - 1) < 0){
                    binary += "0";
                }
            
                //Display the results
                System.out.printf("The binary value is %s", binary);
                break;
            case "b":
                //Convert the letter to the corresponding decimal value
                remainingValue = 11;
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) > 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) == 0){
                    binary += "1";
                } else if ((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) > 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) == 0){
                    binary += "1";
                } else if ((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) > 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) == 0){
                    binary += "1";
                } else if ((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) > 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) == 0){
                    binary += "1";
                } else if ((remainingValue - 1) < 0){
                    binary += "0";
                }

                //Display the results
                System.out.printf("The binary value is %s", binary);
                break;
            case "c":
                //Convert the letter to the corresponding decimal value
                remainingValue = 12;
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) > 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) == 0){
                    binary += "1";
                } else if ((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) > 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) == 0){
                    binary += "1";
                } else if ((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) > 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) == 0){
                    binary += "1";
                } else if ((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) > 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) == 0){
                    binary += "1";
                } else if ((remainingValue - 1) < 0){
                    binary += "0";
                }

                //Display the results
                System.out.printf("The binary value is %s", binary);
                break;
            
            case "d":
                //Convert the letter to the corresponding decimal value
                remainingValue = 13;
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) > 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) == 0){
                    binary += "1";
                } else if ((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) > 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) == 0){
                    binary += "1";
                } else if ((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) > 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) == 0){
                    binary += "1";
                } else if ((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) > 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) == 0){
                    binary += "1";
                } else if ((remainingValue - 1) < 0){
                    binary += "0";
                }

                //Display the results
                System.out.printf("The binary value is %s", binary);
                break;
            case "e":
                //Convert the letter to the corresponding decimal value
                remainingValue = 14;
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) >= 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) >= 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) >= 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) >= 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) < 0){
                    binary += "0";
                }

                //Display the results
                System.out.printf("The binary value is %s", binary);
                break;
            case "f":
                //Convert the letter to the corresponding decimal value
                remainingValue = 15;
                //Check each plaecholder to create the binary number
                if((remainingValue - 8) > 0){
                    remainingValue -= 8;
                    binary += "1";
                }else if((remainingValue - 8) == 0){
                    binary += "1";
                } else if ((remainingValue - 8) < 0){
                    binary += "0";
                }

                if((remainingValue - 4) > 0){
                    remainingValue -= 4;
                    binary += "1";
                }else if((remainingValue - 4) == 0){
                    binary += "1";
                } else if ((remainingValue - 4) < 0){
                    binary += "0";
                }

                if((remainingValue - 2) > 0){
                    remainingValue -= 2;
                    binary += "1";
                }else if((remainingValue - 2) == 0){
                    binary += "1";
                } else if ((remainingValue - 2) < 0){
                    binary += "0";
                }

                if((remainingValue - 1) > 0){
                    remainingValue -= 1;
                    binary += "1";
                }else if((remainingValue - 1) == 0){
                    binary += "1";
                } else if ((remainingValue - 1) < 0){
                    binary += "0";
                }

                //Display the results
                System.out.printf("The binary value is %s", binary);
                break;
            
            default:
                System.out.println(hexDigit + " is an invalid input");
        }

    
    }
}