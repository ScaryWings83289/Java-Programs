// Write a program to create star pattern. 
import java.util.Scanner;
public class RightTriangle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = in.nextInt();
        for(int i=0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
