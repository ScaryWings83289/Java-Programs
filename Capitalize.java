// Write a program to capitalize the first letter of every word in that String. 
import java.util.*;
class Capitalize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = in.nextLine(); 
        String firstLetter = str.substring(0, 1);
        String remainingLetters = str.substring(1, str.length());
        firstLetter = firstLetter.toUpperCase();
        str = firstLetter + remainingLetters;
        System.out.println("Name: " + str);
    }
}
