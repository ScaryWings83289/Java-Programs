// Write a program to find area of circle. 
import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double rad = in.nextDouble();
        double area = Math.PI * rad * rad;
        System.out.println("Area of circle = " + area);
    } 
}
