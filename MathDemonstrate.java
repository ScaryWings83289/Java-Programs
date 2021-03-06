// Write a program to demonstrate various function available in Math class. 
import java.util.Scanner;
import java.lang.Math;
public class MathDemonstrate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double num1 = in.nextDouble();
        System.out.println("Enter number 2: ");
        double num2 = in.nextDouble();
        System.out.println("Power a^b = " + Math.pow(num1,num2));
        System.out.println("Sqrt of " + num1 + " = " + Math.sqrt(num1));
        System.out.println("Cube root of " + num2 + " = " + Math.cbrt(num2));
        System.out.println("Ceil (" + num1 + ") = " + Math.ceil(num1));
        System.out.println("Floor (" + num2 + ") = " + Math.floor(num2));
        System.out.println("Round (" + num1 + ") = "+ Math.round(num1));
        System.out.println("5 random values:");
        for(int i=0; i<5; i++)
            System.out.println(Math.random());
    }
}
