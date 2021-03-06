// Write a program to create 500 random numbers (range 1 to 500) and store them in an array, sort the array and display the sorted array using enhanced for loop. 
import java.lang.Math;
import java.util.Arrays;
public class SortArr {
    public static void main(String[] args) {
        int[] arr = new int[500];
        System.out.println("The random numbers are:");
        for(int i=0; i<500; i++) {
            arr[i] = (int)((Math.random())*500.0);
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println("The sorted numbers are: ");
        for(int val: arr)
            System.out.print(val + " ");
    }
}
