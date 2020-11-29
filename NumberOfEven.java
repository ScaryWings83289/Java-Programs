// Write program to find number of even digits.  
import java.util.*; 
import java.lang.*;
class NumberOfEven {
    public static void main (String[] args)  { 
        int n;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        int even_count = 0; 
        while (n > 0)  { 
            int rem = n % 10; 
            if (rem % 2 == 0) 
                even_count++;  
            n = n / 10; 
        } 
        System.out.println ( "Even count : " +  even_count); 
    }
} 