import java.util.*;

public class game {
    static int player1(Scanner sc) {
        int p1;
        System.out.println("Player 1 Choose your option:");
        System.out.println("1) Rock");
        System.out.println("2) Paper");
        System.out.println("3) Scissor");
        p1 = sc.nextInt();
        return p1;
    }

    static int player2(Scanner sc) {
        int p2;
        System.out.println("Player 2 Choose your option:");
        System.out.println("1) Rock");
        System.out.println("2) Paper");
        System.out.println("3) Scissor");
        p2 = sc.nextInt();
        return p2;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int p1, p2;
        
        p1 = player1(sc);
        p2 = player2(sc);
        
        if (p1 == p2) {
            System.out.println("Draw");
        } 
		else if (p1 == 1 && p2 == 2) {
            System.out.println("Player 2 wins");
        } 
		else if (p1 == 1 && p2 == 3) {
            System.out.println("Player 1 wins");
        } 
		else if (p1 == 2 && p2 == 1) {
            System.out.println("Player 1 wins");
        } 
		else if (p1 == 2 && p2 == 3) {
            System.out.println("Player 2 wins");
        } 
		else if (p1 == 3 && p2 == 1) {
            System.out.println("Player 2 wins");
        } 
		else if (p1 == 3 && p2 == 2) {
            System.out.println("Player 1 wins");
        }
    }
}
