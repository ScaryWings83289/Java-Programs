// Write program to print the second digit.  
import java.util.*; 
import java.lang.*; 
public class SecondDigit{
    public static void main(String[] args){
        int n, y=0;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        while(n>99){ 
            n=n/10;
            y=n%10;
        }
        System.out.println("Second digit is = " + y);
    }
}