// You are given a String at run-time. Delete all duplicate words from the String (ignore the case) and return the modified String. 
import java.io.*;
public class DeleteDuplicate {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        String inpString = read.readLine();        
        String[] words = inpString.split(" ");
        for(int i=0; i<words.length - 1; i++) {
            for(int j=i+1; j<words.length; j++) {
                if(words[j].equalsIgnoreCase(words[i])) {
                    words[j] = "";
                }
            }
        }
        System.out.println("String without repeated words: ");
        for(String word: words) {
            if(!word.equals(""))
                System.out.print(word + " ");
        }
    }
}
