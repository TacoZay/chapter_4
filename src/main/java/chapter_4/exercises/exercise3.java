package chapter_4.exercises;

public class exercise3 {
    public static void main(String[] args){
    //List the 4 cities GPS locations in degrees
    double atlantaX = 33.7489954;
    double atlantaY = -84.3879824;

    double charlotteX = 35.2270869;
    double charlotteY = -80.8431267;

    double orlandoX = 28.5383355;
    double orlandoY = -81.3792385;

    double savannahX = 32.0835407;
    double savannahY = -81.09984342;

    /*Calculate the distance for each city
    conver to radians first */
    atlantaX = Math.toRadians(atlantaX); atlantaY = Math.toRadians(atlantaY);
    charlotteX = Math.toRadians(charlotteX); charlotteY = Math.toRadians(charlotteY);
    orlandoX = Math.toRadians(orlandoX); orlandoY = Math.toRadians(orlandoY);
    savannahX = Math.toRadians(savannahX); savannahY = Math.toRadians(savannahY);
    double radius = 6371.01;

    //Triangle 1: AC, CO, OA
    double ac = radius * Math.acos((Math.sin(atlantaX) * Math.sin(charlotteX)) + (Math.cos(atlantaX) * Math.cos(charlotteX) * Math.cos(atlantaY - charlotteY)));
    double co = radius * Math.acos((Math.sin(charlotteX) * Math.sin(orlandoX)) + (Math.cos(charlotteX) * Math.cos(orlandoX) * Math.cos(charlotteY - orlandoY)));
    double oa = radius * Math.acos((Math.sin(orlandoX) * Math.sin(atlantaX)) + (Math.cos(orlandoX) * Math.cos(atlantaX) * Math.cos(orlandoY - atlantaY)));

    //Triangle 2: CS, CO, SO
    double cs = radius * Math.acos((Math.sin(charlotteX) * Math.sin(savannahX)) + (Math.cos(charlotteX) * Math.cos(savannahX) * Math.cos(charlotteY - savannahY)));
    double so = radius * Math.acos((Math.sin(savannahX) * Math.sin(orlandoX)) + (Math.cos(savannahX) * Math.cos(orlandoX) * Math.cos(savannahY - orlandoY)));

    //compute the area of each triangle and add them together
    double s1 = (ac + co + oa) / 2;
    double s2 = (cs + co + so) / 2;

    double area1 = Math.sqrt(s1 * (s1 - ac) * (s1 - co) * (s1 - oa));
    double area2 = Math.sqrt(s2 * (s2 - cs) * (s2 - co) * (s2 - so));
    double finalArea = area1 + area2;

    //Display the results 
    System.out.printf("The area of between the 4 cities is %.7f\n", finalArea);
}
}
