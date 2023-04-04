package com.kevinsguides;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/*
The Deck class represents a standard deck of playing cards, with 52 cards, consisting of 13 ranks and 4 suits.
Each card is an instance of the Card class, which contains its own suit, rank, and value.
The deck can be shuffled, and cards can be drawn from the deck one at a time.
*/

public class Deck {

    /**
     * An array list of cards representing the deck.
     */
    private ArrayList<Card> deck;


    /**
     * Creates an empty deck.
     */
    public Deck(){
        deck = new ArrayList<Card>();
    }

    public Deck(Deck c){
        Collections.copy(this.deck, c.getCards());
    }

    /**
     * Creates a new deck that is a copy of an existing deck.
     * @param c The deck to copy.
     */
    public Deck(boolean makeDeck){
        deck = new ArrayList<Card>();
        if(makeDeck){
            //gets the suits
            for(Suit suit : Suit.values()){
                //rank values
                for(Rank rank : Rank.values()){
                    //add a new card containing each iteration's suit and rank
                    deck.add(new Card(suit, rank));
                }
            }
        }
    }
    /**
     * Adds a card to the deck.
     * @param card The card to add.
     */
    public void addCard(Card card){
        deck.add(card);
    }
    /**
     * Adds an array list of cards to the deck.
     * @param cards The array list of cards to add.
     */
    public void addCards(ArrayList<Card> cards){
        deck.addAll(cards);
    }

    /**
     * Returns a string representation of the deck.
     * @return The string representation of the deck.
     */
    public String toString(){
        String output = "";
        for(Card card: deck){
            output += card;
            output += "\n";
        }
        return output;
    }

    /**
     * Shuffles the deck using a random number generator.
     */
    public void shuffle(){
        Collections.shuffle(deck, new Random());
    }

    /**
     * Takes a card from the top of the deck.
     * @return The card taken from the top of the deck.
     */
    public Card takeCard(){
        //copy of first card in the deck
        Card cardToTake = new Card(deck.get(0));
        //removes card from deck
        deck.remove(0);
        //return card back
        return cardToTake;
    }

    /**
     * Returns true if the deck has cards, false otherwise.
     * @return True if the deck has cards, false otherwise.
     */
    public boolean hasCards(){
        if (deck.size()>0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns the number of cards left in the deck.
     * @return The number of cards left in the deck.
     */
    public int cardsLeft(){
        return deck.size();
    }

    /**
     * Returns the array list of cards in the deck.
     * @return The array list of cards in the deck.
     */
    public ArrayList<Card> getCards() {
        return deck;
    }

    /**
     * Empties the deck.
     */
    public void emptyDeck(){
        deck.clear();
    }


    /**
     * Reloads the deck from a discarded deck and shuffles the deck.
     * Clears the discarded deck.
     * @param discard The discarded deck to reload from.
     */
    public void reloadDeckFromDiscard(Deck discard){
        this.addCards(discard.getCards());
        this.shuffle();
        discard.emptyDeck();
        System.out.println("Ran out of cards, creating new deck from discard pile & shuffling deck.");
    }
}



//    public void shuffle(){
//        ArrayList<Card> shuffled = new ArrayList<Card>();
//        //iterate through the size of the deck, so each card can be pulled
//        while(deck.size()>0){
//            //Select a random index to pull
//            int cardToPull = (int)(Math.random()*(deck.size()-1));
//            //Add this random card to the new shuffled deck
//            shuffled.add(deck.get(cardToPull));
//            //Remove the pulled card from the original deck
//            deck.remove(cardToPull);
//        }
//        deck = shuffled;
//    }
//}
