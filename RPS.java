import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int wins = 0;
        int loses = 0;
        while (true) {
            System.out.println("Choose rock paper or scissors, 'r' for Rock, 'p' for Paper, 's' for Scissors. To exit choose x");
            System.out.println("*****************************************************");
            System.out.println("Wins: "+wins+"   Loses: "+loses);
            System.out.print("Player's choice: ");
            String p = scanner.next();
            int e = random.nextInt(3)+1;
            String c = computer_choice(e);
            if(c.charAt(0) == p.charAt(0)){
                System.out.println("Draw!");;
            }
            else if((c.charAt(0)=='r' && p.charAt(0)=='p')||(c.charAt(0)=='p' && p.charAt(0)=='s')||(c.charAt(0)=='s' && p.charAt(0)=='r')){
                System.out.println("You win!");
                wins++;
            }
            else if((c.charAt(0)=='p' && p.charAt(0)=='r')||(c.charAt(0)=='s' && p.charAt(0)=='p')||(c.charAt(0)=='r' && p.charAt(0)=='s')){
                System.out.println("You lose!");
                loses++;
            }
            else if(p.charAt(0) == 'x') {
                System.out.println("Game over. ");
                break;
            }
            System.out.println("Computer choice: "+computer_choice_name(e)+"  Player's choice: "+player_choice_name(p));
        }
    }
    public static String computer_choice(int e){
        switch (e) {
            case 1:
                return "r";
            case 2:
                return "p";
            case 3:
                return "s";
            default:
                return "Invalid Choice";
        }
    }
    public static String computer_choice_name(int c_choice) {
        switch (c_choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid Choice";
        }
    }
    public static String player_choice_name(String p_choice){
        switch (p_choice){
            case "r":
                return "Rock";
            case "p":
                return "Paper";
            case "s":
                return "Scissors";
            default:
                return "Invalid answer";
        }
    }
}
