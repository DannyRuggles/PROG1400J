package com.kevinsguides;
/*
The Dealer class represents the dealer in a card game.
It extends the Person class, which holds information about a person's name and hand.
*/
public class Dealer extends Person{
    /*
     * Constructs a Dealer object and sets the name to "Dealer".
     */
    public Dealer(){

        //dealer name
        super.setName("Dealer");

    }
    /*
     * Prints the dealer's first card and the second card face down.
     */
    public void printFirstHand(){
        System.out.println("The dealer's hand looks like this:");
        System.out.println(super.getHand().getCard(0));
        System.out.println("The second card is face down.");
    }
}
