import java.util.*;

public class game {
    static int player(Scanner sc) {
        int p;
        System.out.println("Player Choose your option:");
        System.out.println("1) Rock");
        System.out.println("2) Paper");
        System.out.println("3) Scissor");
        p = sc.nextInt();
        return p;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int p, num;
		Random ran= new Random();
		num=ran.nextInt(3)+1;
        
        p = player(sc);
        
        if (p == num) {
            System.out.println("You both choose same, it's a Draw");
        } 
		else if (p == 1 && num == 2) {
            System.out.println("computer chose Paper,Computer wins");
        } 
		else if (p == 1 && num == 3) {
            System.out.println("computer chose Scissor,Player wins");
        } 
		else if (p == 2 && num == 1) {
            System.out.println("computer chose Rock,Player wins");
        } 
		else if (p == 2 && num == 3) {
            System.out.println("computer chose Scissor,Computer wins");
        } 
		else if (p == 3 && num == 1) {
            System.out.println("computer chose Rock,Computer wins");
        } 
		else if (p == 3 && num == 2) {
            System.out.println("computer chose Paper,Player wins");
        }
		else if(p > 3 || p < 1){
			System.out.println("please choose a valid option");
		}
    }
}
