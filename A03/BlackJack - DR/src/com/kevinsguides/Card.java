package com.kevinsguides;

/*
 * Card class - represents a playing card with a suit and rank, as well as methods for
 * accessing and comparing the card's properties.
 */
public class Card implements Comparable<Card>{

    private Suit suit; // Instance variable to represent the card's suit
    private Rank rank; // Instance variable to represent the card's rank

    /*
     * Constructor that takes a suit and rank as arguments and sets the instance
     * variables accordingly.
     */
    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    /*
     * Constructor that takes another Card object as an argument and sets the instance
     * variables to match those of the other Card.
     */
    public Card(Card card){
        this.suit = card.getSuit();
        this.rank = card.getRank();
    }

    /*
     * Returns the value of the card based on its rank.
     */
    public int getValue(){
        return rank.rankValue;
    }

    /*
     * Returns the Suit object representing the card's suit.
     */
    public Suit getSuit(){
        return suit;
    }

    /*
     * Returns the Rank object representing the card's rank.
     */
    public Rank getRank(){
        return rank;
    }

    /*
     * Returns a String representation of the card, including its rank, suit, and value.
     */
    public String toString(){
        return ("["+rank+" of "+ suit + "] ("+this.getValue()+")");
    }

    /*
     * Compares this card to another card based on their values.
     */
    @Override
    public int compareTo(Card c) {
        if(this.getValue() > c.getValue()){
            return 1;
        }
        else if(this.getValue() < c.getValue()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
