// Write program to print the last digit, which is multiple of 3.  
import java.util.*; 
import java.lang.*;
class LastMultipleOfThree {
    public static void main (String[] args)  { 
        int n, y=0;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        while(n>0){
            y = n%10;
            if(y%3 == 0){
                System.out.println("The last digit which is multiple of 3 is : " + y);
                break;
            }
            n = n/10; 
        }
    }
}