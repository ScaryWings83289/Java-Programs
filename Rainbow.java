// Write a program to find number of ways colors of rainbow can be permuted. 
public class Rainbow {
    public static int fact(int n) {
        if(n < 2)
            return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Total number of ways are : " + fact(7));
    }
}
