// Write a Java program to practice using String Buffer class and its methods. 
import java.util.Scanner;
public class StringBufferClass {
    public static void main(String[] args) {
        System.out.println("Enter a String to show methods of String Buffer:");
        StringBuffer buffer = new StringBuffer(new Scanner(System.in).nextLine());
        System.out.println("The original String: " + buffer);
        System.out.println("Length of the String: " + buffer.length());
        System.out.println("Appending \"String Buffer\" at end of the String: " + buffer.append(" String Buffer"));
        System.out.println("Reverse String: " + buffer.reverse());
    }
}