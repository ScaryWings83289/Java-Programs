// Write program to find sum of all digits.  
import java.util.*; 
import java.lang.*;  
class SumOfDigits { 
    static int getSum(int n) {    
        int sum = 0; 
        while (n != 0) { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
        return sum; 
    } 
    public static void main(String[] args) { 
        int n;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        System.out.println("Sum of all digits: " + getSum(n));
    } 
} 
