// You are given a String at runtime. Replace all the characters at the even index by the character present al all the next even index. Replace the character at the last even index by “1”. 
import java.util.Scanner;
public class ReplaceEven {
    public static void main(String[] main) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = in.next();
        for(int i=0; i<str.length()-1; i+=2)
            str = str.substring(0,i) + (str.charAt(i+2)+"")+str.substring(i+1, str.length());
        str = str.substring(0, str.length()-1) + "1";
        System.out.println("The modified String is: " + str);
    }
}
