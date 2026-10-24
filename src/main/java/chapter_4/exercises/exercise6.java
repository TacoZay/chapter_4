package chapter_4.exercises;
/*4.6(Random points on a circle) Write a program that generates three random points on a circle centered
at (0,0) with a radius 40 and displays three angles in a trianlge formed by these 3 points */

public class exercise6 {
    public static void main(String[] args){
        //Generate the 3 angles
        int angle1 = (int)(Math.random() * (2 * Math.PI));
        int angle2 = (int)(Math.random() * (2 * Math.PI));
        int angle3 = (int)(Math.random() * (2 * Math.PI));

        //Enter in the radius for the circle
        int radius = 40;
        //Compute x & y for each angle
        int x1 = (int)(radius * Math.cos(angle1)); int y1 = (int)(radius * Math.sin(angle1)); 
        int x2 = (int)(radius * Math.cos(angle2)); int y2 = (int)(radius * Math.sin(angle2));
        int x3 = (int)(radius * Math.cos(angle3)); int y3 = (int)(radius * Math.sin(angle3));

        //Convert the angle sinto degrees & display the results
        angle1 = (int)(Math.toDegrees(angle1)); angle2 = (int)(Math.toDegrees(angle2));
        angle3 = (int)(Math.toDegrees(angle3));

        System.out.printf("Angle 1: %d w/ (%d, %d)\n", angle1, x1, y1);
        System.out.printf("Angle 2: %d w/ (%d, %d)\n", angle2, x2, y2);
        System.out.printf("Angle 3: %d w/ (%d, %d)\n", angle3, x3, y3);
        

    }    
}
