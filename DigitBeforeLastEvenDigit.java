// Write a Program to print the digit immediately before the last even digit.  
import java.util.*; 
import java.lang.*;
class DigitBeforeLastEvenDigit {
    public static void main (String[] args)  { 
        int x, m=0;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        x = s.nextInt();
        while(x>0){
            m=x%10;
            if(m%2==0){
                x=x/10;
                m=x%10;
                System.out.println("Digit immediately before the last even digit is: " + m);
                break;
            }
            x=x/10;
        }           
    }
}