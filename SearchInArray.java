// Write a program to search element in an array. 
import java.util.Scanner;
public class SearchInArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of array elements: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the array element to search: ");
        int search = in.nextInt();
        boolean flag = false;
        for(int i=0; i<n; i++) {
            if(arr[i] == search) {
                System.out.println(search + " found at index " + (i+1));
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println(search + " not found in array!");
    }
}
