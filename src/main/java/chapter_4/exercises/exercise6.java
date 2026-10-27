package chapter_4.exercises;
/*4.6(Random points on a circle) Write a program that generates three random points on a circle centered
at (0,0) with a radius 40 and displays three angles in a trianlge formed by these 3 points */

public class exercise6 {
    public static void main(String[] args){
        //Generate the 3 angles
        // int min = 0;
        // int max = (int)(2 * Math.PI);
        double angle1 = (Math.random() * (2 * Math.PI));
        double angle2 = (Math.random() * (2 * Math.PI));
        double angle3 = (Math.random() * (2 * Math.PI));
        /*the random function is generating a value a between 0 - 180. How can i extend the
        endpoint where it's 181 instead? */

        //Enter in the radius for the circle
        int radius = 40;
        //Compute x & y for each angle
        double x1 = (radius * Math.cos(angle1)); double y1 = (radius * Math.sin(angle1)); 
        double x2 = (radius * Math.cos(angle2)); double y2 = (radius * Math.sin(angle2));
        double x3 = (radius * Math.cos(angle3)); double y3 = (radius * Math.sin(angle3));

        //Compute the distance betwen each point
        double AB =  (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
        double BC =  (Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3)));
        double CA =  (Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1)));
        
        //Compute the angle of the inner triangle
        double triangleAngle1 =  (Math.acos((AB * AB - BC * BC - CA * CA) / (-2 * BC * CA)));
        double triangleAngle2 =  (Math.acos((BC * BC - AB * AB - CA * CA) / (-2 * AB * CA)));
        double triangleAngle3 =  (Math.acos((CA * CA - AB * AB - BC * BC) / (-2 * AB * BC)));
        

        //Convert the computed triangle angles into degrees
        triangleAngle1 = Math.round((Math.toDegrees(triangleAngle1) * 100) / 100.0);
        triangleAngle2 = Math.round((Math.toDegrees(triangleAngle2) * 100) / 100.0);
        triangleAngle3 = Math.round((Math.toDegrees(triangleAngle3) * 100) / 100.0);
        
        System.out.printf("Angle 1: %.0f w/ (%f, %f)\n", triangleAngle1, x1, y1);
        System.out.printf("Angle 2: %.0f w/ (%f, %f)\n", triangleAngle2, x2, y2);
        System.out.printf("Angle 3: %.0f w/ (%f, %f)\n", triangleAngle3, x3, y3);
        

    }    
}
