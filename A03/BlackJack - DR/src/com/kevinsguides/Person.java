package com.kevinsguides;

public abstract class Person {
    /*
    //hand = active cards
     */
    private Hand hand;
    private String name;

    public Person(){
        //assigns cards(Hand) and a name("")
        this.hand = new Hand();
        this.name = "";
    }

    /**
    //getters and setters
     */
    public Hand getHand(){
        return this.hand;
    }
    public void setHand(Hand hand){
        this.hand = hand;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    /**
    //print person's hand
     */
    public void printHand(){
        System.out.println(this.name + "'s hand looks like this:");
        System.out.println(this.hand + " Valued at: " + this.hand.calculatedValue());
    }

    /*
     * Player takes card from deck
     * If deck is gone, it will be reloaded from the discard pile
     * Prints hand after taking the card
     */
    public void hit(Deck deck, Deck discard){

        //if deck is gone
        if (!deck.hasCards()) {
            deck.reloadDeckFromDiscard(discard);
        }
        this.hand.takeCardFromDeck(deck);
        System.out.println(this.name + " gets a card");
        //prints hand
        this.printHand();
        Game.pause();
    }

    /*
     * Checks if person has blackjack
     * Returns true if the calculatedValue of their hand is 21, false otherwise
     */
    public boolean hasBlackjack(){
        if(this.getHand().calculatedValue() == 21){
            return true;
        }
        else{
            return false;
        }
    }
}


//package com.kevinsguides;
//
//
//
//public abstract class Person {
//
//    private Hand hand;
//    private String name;
//
//    /**
//     * Create a new Person
//     */
//    public Person(){
//        this.hand = new Hand();
//        this.name = "";
//    }
//    public Hand getHand(){
//        return this.hand;
//    }
//    public void setHand(Hand hand){
//        this.hand = hand;
//    }
//    public String getName(){
//        return this.name;
//    }
//    public void setName(String name){
//        this.name = name;
//
//    }
//    public boolean hasBlackjack(){
//        if(this.getHand().calculatedValue() == 21){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    /**
//     * Prints a formatted version of the Person's hand
//     */
//    public void printHand(){
//        System.out.println(this.name + "'s hand looks like this:");
//        System.out.println(this.hand + " Valued at: " + this.hand.calculatedValue());
//    }
//
//}
//
