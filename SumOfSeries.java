// Write a Program to find sum of series 1 + 1/2 + 1/3 + 1/4 + …… + 1/n. 
import java.util.*; 
class SumOfSeries { 
    static double sum(int n) { 
        double i, s = 0.0; 
        for (i = 1; i <= n; i++) 
            s = s + 1/i; 
        return s; 
    } 
    public static void main(String args[]) { 
        int n;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        n = s.nextInt(); 
        System.out.printf("Sum is %f", sum(n));           
    } 
} 