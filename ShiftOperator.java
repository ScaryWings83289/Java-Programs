// Write a program for shift operators. 
import java.util.*;
public class ShiftOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, count;
        System.out.println("Enter the number: ");
        num = in.nextInt();
        System.out.println("Enter the number of times you want to left or right shift the number: ");
        count = in.nextInt();
        System.out.println("Number after left shift: " + (num<<count));
        System.out.println("Number after right shift: " + (num>>count));
    }
}
