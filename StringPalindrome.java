// Write a program to check whether a string is palindrome or not. 
import java.util.*;
public class StringPalindrome {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the String: ");
      String str = in.nextLine(); 
      StringBuffer buffer = new StringBuffer(str);
      buffer.reverse();
      String data = buffer.toString();
      if(str.equals(data)){
         System.out.println("Given String is palindrome.");
      } else {
         System.out.println("Given String is not palindrome.");
      }
   }
}
