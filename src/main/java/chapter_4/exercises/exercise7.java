package chapter_4.exercises;
import java.util.Scanner;
/*Write a program that prompts the user to enter the radius 
of the bounding circle of a pentagon and displays the five
corner points on the pentagon from p1 to p5 */
public class exercise7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = sc.nextDouble();

        //Compute the 5 angles for the pentagon(in radians)
        double angle1 = (Math.PI/2); double angle2 = angle1 + ((2 * Math.PI)/5);
        double angle3 = angle2 + ((2 * Math.PI)/5); double angle4 = angle3 + ((2 * Math.PI)/5);
        double angle5 = angle4 + ((2 * Math.PI)/5);

        //Compute x & y for each angle
        double x1 = radius * Math.cos(angle5); double y1 = radius * Math.sin(angle5);
        double x2 = 0; double y2 = radius;
        double x3 = radius * Math.cos(angle2); double y3 = radius * Math.sin(angle2);
        double x4 = radius * Math.cos(angle3); double y4 = radius * Math.sin(angle3);
        double x5 = radius * Math.cos(angle4); double y5 = radius * Math.sin(angle4);

        //Display the results
        System.out.printf("""
                          The coordinates of five points of on the pentagon are
                          (%.02f, %.02f)
                          (%.02f, %.02f)
                          (%.02f, %.02f)
                          (%.02f, %.02f)
                          (%.02f, %.02f)
                          """,x1,y1, x2, y2, x3, y3, x4, y4, x5, y5);
    }    
}
