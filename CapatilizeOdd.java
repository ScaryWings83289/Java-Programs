// You are given a String at runtime. Capitalize all the characters at all odd indexes in the string. 
import java.io.*;
public class CapatilizeOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        String inpStr = read.readLine();
        String outStr = "";
        for(int i=0; i<inpStr.length(); i++) {
            if(i%2 == 0) {
                outStr = outStr + Character.toUpperCase(inpStr.charAt(i));
            } else {
                outStr = outStr + inpStr.charAt(i);
            }
        }
        System.out.println("String with all odd letter capitals is: " + outStr);
    }
}
