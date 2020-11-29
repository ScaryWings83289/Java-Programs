// Write a program to print first digit. e.g. input 23516 output  
import java.util.*; 
import java.lang.*;  
public class FirstDigit{ 
    public static int Digit(int n) { 
        while (n >= 10)  
            n /= 10; 
        return n; 
    } 
    public static void main(String argc[]) { 
        int n;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        System.out.println("First digit of the given number is: " + Digit(n)); 
    } 
} 