// Write program to print positional values of digits. Input 21463 output 3, 60, 400, 1000 and 20000.  
import java.util.*; 
import java.lang.*;
class PositionalValue {
    public static void main (String[] args)  { 
        int x, m=0,n=1;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        x = s.nextInt();
        System.out.print("Positional Values of the give number are: ");
        while(x>0){
            m=x%10;
            m=m*n;
            System.out.print(m +",");
            n=n*10;
            x=x/10;
        }
    }
}