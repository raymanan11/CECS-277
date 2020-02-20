/**
 * @author Raymond An
 * February 4th, 2020
 * Purpose: Class meant to represent a card and used by the deck class to make
 * a deck of 52 cards. Card has a suit, rank, and a value
 */

package IPIProject;

public class Cards {
    private String suit;
    private String rank;
    private int value;

    // default constructor
    public Cards() {
        suit = "";
        rank = "";
        value = 0;

    }

    /**
     * Constructor used to give a card it's suit and rank
     * @param suit of the card (Hearts, Clubs, Spades, Clubs)
     * @param rank is the value of the card (2-Ace) and depending on the rank
     * a va;ue is assigned
     */

    public Cards(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;

        switch (rank) {
            case "2":
                value = 2;
                break;
            case "3":
                value = 3;
                break;
            case "4":
                value = 4;
                break;
            case "5":
                value = 5;
                break;
            case "6":
                value = 6;
                break;
            case "7":
                value = 7;
                break;
            case "8":
                value = 8;
                break;
            case "9":
                value = 9;
                break;
            case "10":
                value = 10;
                break;
            case "Jack":
                value = 11;
                break;
            case "Queen":
                value = 12;
                break;
            case "King":
                value = 13;
                break;
            case "Ace":
                value = 14;
                break;
        }
    }

    /**
     * @return value of the card (2-14 depending on the rank of the card)
     */
    public int getValue() {
        return value;
    }

    /**
     * @return string that says rank and suit of card
     */
    public String toString() {
        return rank + " of " + suit;
    }

}
