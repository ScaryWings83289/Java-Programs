// The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence. 
import java.util.Scanner;
public class Fibonacci{
    public static void findFibo(int n){
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        for(int i=2; i<=n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of items of series to print: ");
        int n = scan.nextInt();
        if(n==0) {
            System.out.println("0");
        } else {
            System.out.println(n + " fibonacci numbers are: ");
            findFibo(n);
        }
    }
}
