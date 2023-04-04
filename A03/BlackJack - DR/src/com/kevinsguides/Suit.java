package com.kevinsguides;
/*
// All the card suits
*/
public enum Suit {
    // Enum values with their respective string names
    CLUB("Clubs"),
    DIAMOND("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades");

    String suitName;

    /*
    // Constructor for Suit
     */
    Suit(String suitName) {
        this.suitName = suitName;
    }

    /*
    // Returns the string name of the Suit
     */
    public String toString(){
        return suitName;
    }
}
