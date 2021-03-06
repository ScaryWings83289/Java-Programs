// Write a program to find the number of ways a team of given number of players can be chosen from the complete squad. 
import java.util.*;
public class Probability {
    private static long fact(int n) {
        if(n == 1)
            return 1;
        return n*fact(n-1);
    }   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total number of players: ");
        int players = in.nextInt();
        System.out.println("Enter number of players required in team: ");
        int req = in.nextInt();
        int probability = (int) (fact(players) / (fact(players - req) * fact(req)));
        System.out.println("A team of " + req + " players out of " + players + " can be chosen in: " + probability + " ways."); 
    }
}
