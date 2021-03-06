// Write program to find number of digits. 
import java.util.*; 
import java.lang.*;
class NumberOfDigits {
    static int countDigit(long n){
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }
    public static void main(String[] args){
        long n;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        System.out.print("Number of digits : " + countDigit(n));
    }
}