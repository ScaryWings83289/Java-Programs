// Write a program for use of various arithmetic, logical, bitwise, unary, ternary, assignment operators. 
import java.util.*;
public class OperatorUse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.print("Enter number 1: ");
        a = in.nextInt();
        System.out.print("Enter number 2: ");
        b = in.nextInt();
        System.out.println("Addition:\t\t"+(a+b));
        System.out.println("Substraction:\t\t"+(a-b));
        System.out.println("Multiplication:\t\t"+(a*b));
        System.out.println("Bitwise left:\t\t"+(a<<b));
        System.out.println("Bitwise Right:\t\t"+(a>>b));
        System.out.println("Checking if a > b:\t"+(a>b));
        System.out.println("Checking if a < b:\t"+(a<b));
        System.out.println("Checking equality:\t"+(a==b));
    }
}
