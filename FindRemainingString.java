// You are given a String at runtime. You are required to fetch the remaining String after the occurrence of a certain sequence / character. 
import java.io.*;
public class FindRemainingString {
    public static void main(String[] args) throws IOException {
    	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the String: ");
    	String inpStr = read.readLine(), outString;
    	System.out.println("Enter the word to find the String after it: ");
    	String findWord = read.readLine();
    	int findIndex = inpStr.indexOf(" "+findWord+" ");
    	if(findIndex == -1) {
    	    outString = inpStr;
    	} else {
    	    outString = inpStr.substring(findIndex + findWord.length() + 2);
    	}
    	System.out.println("Required String: " + outString);
    }
}
