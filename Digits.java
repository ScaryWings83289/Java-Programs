// Write program to print the kth digit from last. e.g. input 23617 and k=4 output 3.  
import java.util.*; 
import java.lang.*; 
public class Digits { 
    public static int kthdigit(int a, int b) 
    {
        int p = (int)a; 
        int count = 0; 
        while (p > 0 && count < b) { 
            int rem = p % 10; 
            count++; 
            if (count == b) 
                return rem; 
            p = p / 10; 
        } 
        return 0; 
    }
    public static void main(String argc[]) { 
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the input number: ");
        a = s.nextInt();
        System.out.print("Enter the position of no. from last you want to know: ");
        b = s.nextInt();
        System.out.println(kthdigit(a, b)); 
    }    
} 