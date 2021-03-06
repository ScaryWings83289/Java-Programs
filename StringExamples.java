// Write a program to demonstrate various String/StringBuffer/StringBuilder functions for: Reversing a string (check palindrome), conversion to uppercase/lowercase, equality check of strings, inserting/deleting characters/sequence at a particular index, searching a sequence/character in String at a particular position in String. Fetching the index of a particular characters/substring, Replacing the occurrence of a substring/character in a string, comparing string lexicographically, splitting a string based on a given token, etc. 
import java.lang.StringBuilder;
import java.util.Scanner;
public class StringExamples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = in.nextLine();        
        StringBuilder strB = new StringBuilder(str);
        strB.reverse();        
        String upCaseStr = str.toUpperCase();
        String lowCaseStr = str.toLowerCase();        
        if(str.equals(strB.toString())) {
            System.out.println(str + " is a palindrome String");
        } 
        else {
            System.out.println(str + " is not a palindrome String");
        }        
        System.out.println(str + " in Upper Case: " + upCaseStr);
        System.out.println(str + " in Lower Case: " + lowCaseStr);        
        System.out.print("Enter the second string to check equality: ");
        String str2 = in.nextLine();        
        if(str2.equals(str)) {
            System.out.println("Both the String are equal");
        } 
        else {
            System.out.println("Strings are not equal");
        }        
        System.out.print("Enter the sequence to be searched: ");
        String searchString = in.nextLine();        
        int searchIndex = str.indexOf(searchString);
        if(searchIndex == -1) {
            System.out.println(str + " do not contain " + searchString);
        } 
        else {
            System.out.println(str + " contains " + searchString + " at location " + searchIndex);
        }        
        System.out.print("Enter the token from where to split: ");
        String token = in.next();        
        String[] split = str.split(token);        
        for(String ch: split) {
            System.out.println(" ");
            System.out.println(ch);
        }
    }
}
