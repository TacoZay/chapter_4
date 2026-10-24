package chapter_4.exercises;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Prompt the user to enter the # of sides
        System.out.print("Enter the number of sides: ");
        int sides = sc.nextInt();

        //Prompt the user to enter in the length
        System.out.print("Enter the side: ");
        double length = sc.nextDouble();

        //Compute the area
        double area = (sides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sides));

        //Display the area
        System.out.printf("The area of the polygon is %f\n", area);
    }    
}
