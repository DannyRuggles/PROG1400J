package com.kevinsguides;
import java.util.Scanner;

public class Player extends Person {
    Scanner input = new Scanner(System.in);

    /*
    // Creates new player
     */
    public Player() {
        super.setName("Player");
    }

    /*
     * Method to prompt the user for their move (hit or stand)
     * Calls makeDecision() method recursively until player chooses to stand or goes bust.
     *
     * Parameters:
     *   deck (Deck): The deck of cards from which the player can take a card.
     *   discard (Deck): The deck of cards that have already been played.
     */
    public void makeDecision(Deck deck, Deck discard) {
        //decision = choice
        int  decision = 0;
        boolean getNum = true;

        while(getNum){
            try{
                System.out.println("Would you like to: 1) Hit or 2) Stand");
                decision = input.nextInt();
                getNum = false;

            }
            catch(Exception e){
                System.out.println("Invalid");
                input.next();
            }
        }

        //if hit
        if (decision == 1) {

            this.hit(deck, discard);
            //return blackjack or bust
            if(this.getHand().calculatedValue()>20){
                return;
            }
            else{
                //hit or stand again
                this.makeDecision(deck, discard);
            }
        } else {
            //they stand if enter anything other than 1
            System.out.println("You stand.");
        }
    }
}


//package com.kevinsguides;
//
//public class Player extends Person {
//
//    //Create a new Player
//    public Player() {
//
//        super.setName("Player");
//
//    }
//
//    public void makeDecision() {
//        //Coming Soon
//    }
//
//}
