package chapter_4.exercises;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Prompt the user to enter in the radius
        System.out.print("Enter the length from the center to a vortex: ");
        double radius = sc.nextDouble();

        //Compute the side
        double side = 2 * radius * Math.sin((Math.PI/5));

        //Compute the area
        double area = (5 * Math.pow(side,2)) / (4 * Math.tan(Math.PI/5));

        //Display the results 
        System.out.printf("The area of the pentagon is %.2f\n", area);

    }
}