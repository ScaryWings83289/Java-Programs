// Write program to find sum of even digits. 
import java.util.*; 
import java.lang.*;  
class SumOfEven { 
    static int reverse(int n) { 
        int rev = 0; 
        while (n != 0) { 
            rev = (rev * 10) + (n % 10); 
            n /= 10; 
        } 
        return rev; 
    } 
    static void getSum(int n) { 
        n = reverse(n); 
        int sumEven = 0, c = 1; 
        while (n != 0) { 
            if (c % 2 == 0) 
                sumEven += n % 10; 
            n /= 10; 
            c++; 
        }  
        System.out.println("Sum of even number = " + sumEven); 
    } 
    public static void main(String args[]) { 
        int n;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        getSum(n); 
    } 
} 