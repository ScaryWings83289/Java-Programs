// Find sum of numbers formed by exchanging consecutive digits. 
import java.util.*; 
import java.lang.*;
class SumOfNumbersByExchanging {
    public static void main (String[] args)  { 
        int x, y=0,z=0,sum=0, m=0;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        x = s.nextInt();
        while (x>9){
            y=x%10;
            x=x/10;
            z=x%10;
            y=y*10;
            sum=sum+y+z;
        } 
        System.out.println("sum of numbers formed by consecutive digits=" + sum);
    }
}