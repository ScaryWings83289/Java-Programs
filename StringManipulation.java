// Write a program for String manipulation. 
import java.util.*;
public class StringManipulation {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        str = in.nextLine();
        System.out.println("String length : " + str.length());
        System.out.println("String in Upper Case : " + str.toUpperCase());
        System.out.println("String in Lower Case : " + str.toLowerCase());
    }
}
