package String_Questions.Level3;
import java.util.*;
public class DeckOfCards {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King", "Ace"};
        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }
        Collections.shuffle(deck);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();
        if (players * cardsPerPlayer > deck.size()) {
            System.out.println("Not enough cards for " + players + " players!");
            return;
        }
        String[][] playerCards = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck.get(index++);
            }
        }
        System.out.println("\n--- Cards Distribution ---");
        for (int i = 0; i < players; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.print(playerCards[i][j] + " | ");
            }
            System.out.println();
        }

	}

}

