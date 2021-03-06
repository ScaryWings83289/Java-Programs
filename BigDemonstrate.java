// Demonstrate the use of BigInteger and BigDecimal classes to perform operations on very large integers and decimals. 
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.*;
public class BigDemonstrate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter big decimal number 1: ");
        String num1 = in.next();
        System.out.print("Enter big decimal number 2: ");
        String num2 = in.next();
        BigDecimal a = new BigDecimal(num1);
        BigDecimal b = new BigDecimal(num2);
        BigDecimal sum = a.add(b);
        System.out.println("BigDecimal sum = " + sum);
        System.out.println("----------------------");
        System.out.print("Enter big integer 1: ");
        num1 = in.next();
        System.out.print("Enter big integer 2: ");
        num2 = in.next();
        BigInteger big1 = new BigInteger(num1);
        BigInteger big2 = new BigInteger(num2);
        BigInteger bigSum = big1.add(big2);
        System.out.println("BigInteger sum = " + bigSum);
    }
}
