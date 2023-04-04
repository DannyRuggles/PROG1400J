package com.kevinsguides;
import com.sun.source.tree.PackageTree;
import java.util.ArrayList;
import java.util.Collections;

public class Hand {

    private ArrayList<Card> hand;

    /**
     * Constructor for creating a new Hand object.
     */
    public Hand(){
        hand = new ArrayList<Card>();
    }

    /**
     * Takes a card from the deck and adds it to the hand.
     *
     * @param deck The deck to take the card from.
     */
    public void takeCardFromDeck(Deck deck){
        hand.add(deck.takeCard());
    }

    /**
     * Discards all the cards in the hand and adds them to the discard deck.
     *
     * @param discardDeck The discard deck to add the cards to.
     */
    public void discardHandToDeck(Deck discardDeck){
        //copy cards from hand to discardDeck
        discardDeck.addCards(hand);
        //clear the hand
        hand.clear();
    }

    /**
     * Returns a string representation of the cards in the hand.
     *
     * @return A string representation of the cards in the hand.
     */
    public String toString(){
        String output = "";
        for(Card card: hand){
            output += card + " - ";
        }
        return output;
    }


    /**
     * Calculates and returns the value of the hand.
     *
     * @return The calculated value of the hand.
     */
    public int calculatedValue(){
        //counts number of aces/current total value
        int value = 0;
        int aceCount = 0;

        for(Card card: hand){
            value += card.getValue();
            if (card.getValue() == 11){
                aceCount ++;
            }
        }
        //go back and set each ace to 1 until get back under 21, if possible
        if (value > 21 && aceCount > 0){
            while(aceCount > 0 && value > 21){
                aceCount --;
                value -= 10;
            }
        }
        return value;
    }

    /**
     * Gets the card at the specified index in the hand.
     *
     * @param idx The index of the card to get.
     * @return The card at the specified index.
     */
    public Card getCard(int idx){
        return hand.get(idx);
    }
}

