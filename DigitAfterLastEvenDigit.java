// Write program to print the digit immediately after the last even digit.  
import java.util.*; 
import java.lang.*;
class DigitAfterLastEvenDigit {
    public static void main (String[] args)  { 
        int n, y=0;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        while(n > 0){
            if(n%2 == 0){
                System.out.println("The digit immediately after the last even digit=" + y);
                break; 
            }
            y=n%10;
            n=n/10;
        }
    }
}