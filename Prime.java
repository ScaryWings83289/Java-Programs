// Write a program to compute given number is prime or not. 
import java.util.Scanner;
public class Prime{
    private static boolean isPrime(int n) {
        for(int i = 2; i<= (n/2); i++)
            if(n % i == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number to check if it is prime: ");
        int n = new Scanner(System.in).nextInt();
        boolean prime = isPrime(n);
        if(prime)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }
}