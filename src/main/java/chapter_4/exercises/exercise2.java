package chapter_4.exercises;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double latitude1 = sc.nextDouble();
        double longitude1 = sc.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double latitude2 = sc.nextDouble();
        double longitude2 = sc.nextDouble();

        double x1 = Math.toRadians(latitude1);
        double y1 = Math.toRadians(longitude1);

        double x2 = Math.toRadians(latitude2);
        double y2 = Math.toRadians(longitude2);

        //apply the formula to compute the distance
        double radius = 6371.01;
        double distance = radius * Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));

        //display the results
        System.out.printf("The distance between two points %f\n", distance);
    }
}
