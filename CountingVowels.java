// You are given a String at runtime. Find total vowels in the given String and also display the count of each vowel in the String. 
import java.io.*;
public class CountingVowels {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        String inpString = read.readLine();        
        int[] vowelCount = {0, 0, 0, 0, 0};        
        for(int i=0; i<inpString.length(); i++) {
            char currentChar = inpString.charAt(i);
            if(currentChar == 'a' || currentChar == 'A')
                vowelCount[0]++;
            else if(currentChar == 'e' || currentChar == 'E')
                vowelCount[1]++;
            else if(currentChar == 'i' || currentChar == 'I')
                vowelCount[2]++;
            else if(currentChar == 'o' || currentChar == 'O')
                vowelCount[3]++;
            else if(currentChar == 'u' || currentChar == 'U')
                vowelCount[4]++;
        }        
        System.out.println("Total vowels: " + (vowelCount[0] + vowelCount[1] + vowelCount[2] + vowelCount[3] + vowelCount[4])); 
        System.out.println("Total a: " + vowelCount[0]);
        System.out.println("Total e: " + vowelCount[1]);
        System.out.println("Total i: " + vowelCount[2]);
        System.out.println("Total o: " + vowelCount[3]);
        System.out.println("Total u: " + vowelCount[4]);
    }
}