// You are given a String at run time. Count the occurrence of a given word / sequence in that String. 
import java.io.*;
public class CountOccurence {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        String inpString = read.readLine();
        System.out.println("Enter the word to count its number of occurences: ");
        String countWord = read.readLine();
        int count = 0;
        String[] wordArr = inpString.split(" ");
        for(String word: wordArr) {
            if(word.equalsIgnoreCase(countWord)) {
                count++;
            }
        }
        System.out.printf("No. of times %s appears = %d" , countWord , count);
    }
}
