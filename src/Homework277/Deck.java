package Homework277;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Cards> deck = new ArrayList<>();

    ArrayList<Cards> player1 = new ArrayList<>();
    ArrayList<Cards> player2;

    ArrayList<Cards> warPile = new ArrayList<>();

    int topCard = 0;
    int war = 3;

    final String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
    final String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King", "Ace"};

    /* default constructor used to create deck with 52 cards.
    used for loops to go through every suit and every rank then would
    instantiate a card object and add that card into the deck
     */
    public Deck() {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                Cards card = new Cards(suits[i], rank[j]);
                deck.add(card);
            }
        }
    }

    // shuffle deck of cards
    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void deal() {
        int halfCards = deck.size() / 2;

        // deals first 26 cards from the main deck into player1's hand
        for (int i = 0; i < halfCards; i++) {
            player1.add(deck.get(i));
        }

        // removes those 26 cards dealt into player1's hand from main deck
        for (int i = 0; i < halfCards; i++) {
            deck.remove(topCard);
        }

        // remaining cards from main deck becomes player2's hand
        player2 = deck;
    }

    public void play() {
        try {
            while (player1.size() > 0 && player2.size() > 0) {
                System.out.println("Player 1 plays " + player1.get(topCard));
                System.out.println("Player 2 plays " + player2.get(topCard));
                System.out.println();
                compare(warPile);
            }

            System.out.println("Game Over!");
            if(player1.size() == 0) {
                System.out.println("Player 2 wins the game!");
            }
            else {
                System.out.println("Player 1 wins the game!");
            }
        }

        catch(Exception error) {
            System.out.println("Game Over!");
            if(player1.size() == 0) {
                System.out.println("Player 2 wins the game!");
            }
            else {
                System.out.println("Player 1 wins the game!");
            }
        }
    }

    public void compare(ArrayList warPile) {
        // if value of cards played by player1 and player 2 are equal, then goes to War
        if(player1.get(topCard).getValue() == player2.get(topCard).getValue()) {
            War();
        }
        // if player1's card is greater than player2's card
        else if(player1.get(topCard).getValue() > player2.get(topCard).getValue()) {

            // remove card that player2 played from player2's hand and add it to bottom of player1's hand
            player1.add(player2.get(topCard));
            player2.remove(topCard);

            // then place card player1 played to the bottom of player1's hand
            player1.add(player1.get(topCard));
            player1.remove(topCard);

            // adds warPile to player1's hand if any
            player1.addAll(warPile);

            System.out.println("Player 1 wins the round");
        }
        /*
        else, this means player2's card is greater than player1's card so take card player1 played
        and place it to bottom of player2's hand, then put card played by player2 and place it to
        bottom of player2's hand
         */
        else {
            player2.add(player1.get(topCard));
            player1.remove(topCard);
            player2.add(player2.get(topCard));
            player2.remove(topCard);

            //adds warPile to player2's hand if any
            player2.addAll(warPile);

            System.out.println("Player 2 wins the round");
        }
        System.out.println();
        System.out.println("Player 1's Deck");
        System.out.println(player1);
        System.out.println(player1.size());
        System.out.println();
        System.out.println("Player 2's Deck");
        System.out.println(player2);
        System.out.println(player2.size());
        System.out.println();

    }

    /* TODO: Handle what happens if war cards that are drawn are equal and also add cards won
    by player after war
     */
    public void War() {

        System.out.println("War");

        // when war, first adds player1's card played and player2's card played to warPile
        // and also removes respective cards from their deck
        warPile.add(player1.get(topCard));
        player1.remove(topCard);
        warPile.add(player2.get(topCard));
        player2.remove(topCard);

        //player1 and player2 takes turns playing war cards
        for (int i = 0; i < war; i++) {
            // adds player1 war card to warPile
            warPile.add(player1.get(topCard));
            System.out.println("War card for player1 is xx " + player1.get(topCard));
            player1.remove(topCard);
            // adds player2 war card to warPile
            warPile.add(player2.get(topCard));
            System.out.println("War card for player2 is xx " + player2.get(topCard));
            player2.remove(topCard);
        }
        System.out.println("War card for player1 is " + player1.get(topCard));
        System.out.println("War card for player2 is " + player2.get(topCard));
        System.out.println();

        System.out.println("War Pile: " + warPile);
        compare(warPile);

        warPile.removeAll(warPile);
        System.out.println("Empty War Pile: " + warPile);
    }

    // print out all the cards in the deck
    public String toString() {
        String decks = deck.toString();
        return decks;
    }

    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffle();
        System.out.println("Non-shuffled");
        System.out.println(deck);
        System.out.println();

        deck.deal();

        System.out.println("Start Player 1's Deck");
        System.out.println(deck.player1);
        System.out.println(deck.player1.size());
        System.out.println();
        System.out.println("Start Player 2's Deck");
        System.out.println(deck.player2);
        System.out.println(deck.player2.size());
        System.out.println();

        System.out.println("Start play: ");
        System.out.println();
        deck.play();


    }
}
