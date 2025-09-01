package String_Questions.Level2;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int playerWins = 0, computerWins = 0, draws = 0;
        System.out.print("How many rounds do you want to play? ");
        int rounds = sc.nextInt();
        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nRound " + i + ":");
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String playerChoice = sc.next().toLowerCase();
            int compNum = ran.nextInt(3); 
            String compChoice = "";
            if (compNum == 0) {
                compChoice = "rock";
            } else if (compNum == 1) {
                compChoice = "paper";
            } else {
                compChoice = "scissors";
            }
            System.out.println("Computer chose: " + compChoice);
            if (playerChoice.equals(compChoice)) {
                System.out.println("Result: Draw");
                draws++;
            } else if ((playerChoice.equals("rock") && compChoice.equals("scissors")) ||
                       (playerChoice.equals("paper") && compChoice.equals("rock")) ||
                       (playerChoice.equals("scissors") && compChoice.equals("paper"))) {
                System.out.println("Result: You win!");
                playerWins++;
            } else {
                System.out.println("Result: Computer wins!");
                computerWins++;
            }
        }
        int totalGames = playerWins + computerWins;
        double playerWinPercent = 0;
        double compWinPercent = 0;
        if (totalGames > 0) {
            playerWinPercent = (playerWins * 100.0) / totalGames;
            compWinPercent = (computerWins * 100.0) / totalGames;
        }
        System.out.println("\n===== Game Stats =====");
        System.out.println("---------------------------------");
        System.out.println(" Player Wins   | " + playerWins);
        System.out.println(" Computer Wins | " + computerWins);
        System.out.println(" Draws         | " + draws);
        System.out.println("---------------------------------");
        System.out.printf(" Player Win %%   | %.2f%%\n", playerWinPercent);
        System.out.printf(" Computer Win %% | %.2f%%\n", compWinPercent);
        System.out.println("---------------------------------");
	}

}
