package Homework277;

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

    /* takes in String variables suit and rank and assigns it to
    private variables suit, rank, and value
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

    public int getValue() {
        return value;
    }

    // custom toString used to print out clear card rank, suit, and value
    public String toString() {
        return rank + " of " + suit + " with value of " + value;



























































































    }


}
