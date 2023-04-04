package com.kevinsguides;

import java.util.Scanner;

/**
 This class represents the game logic of the Blackjack game.
 */
public class Game {

    //variables for game
    private Deck deck, discarded;
    private Dealer dealer;
    private Player player;
    private int wins, losses, pushes;



    /**
     Constructor for the Game class.
     Initializes a new deck and starts a new round.
     */
    public Game(){

        //new deck
        deck = new Deck(true);
        //new empty deck
        discarded = new Deck();

        //creates player & dealer
        dealer = new Dealer();
        player = new Player();


        //shuffle before round
        deck.shuffle();
        startRound();
    }


    /**
     Starts a new round of the game.
     Deals cards to the player and dealer, and handles the player's decision-making process.
     */
    private void startRound(){

        //first round/display score
        if(wins>0 || losses>0 || pushes > 0){
            System.out.println();
            System.out.println("Starting Next Round... Wins: " + wins + " Losses: "+ losses+ " Pushes: "+pushes);
            dealer.getHand().discardHandToDeck(discarded);
            player.getHand().discardHandToDeck(discarded);
        }

        //check deck has 4 cards left to start round
        if(deck.cardsLeft() < 4){
            //reload deck from discarded if we're out of cards
            deck.reloadDeckFromDiscard(discarded);
        }

        //deal 2 cards to dealer
        dealer.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);

        //deal 2 cards to player
        player.getHand().takeCardFromDeck(deck);
        player.getHand().takeCardFromDeck(deck);

        //print dealers hand
        dealer.printFirstHand();

        //print players hand
        player.printHand();

        //if dealer has BlackJack
        if(dealer.hasBlackjack()){
            dealer.printHand();

            //if player has BlackJack
            if(player.hasBlackjack()){
                //round ends with a push
                System.out.println("You both have 21 - Push.");
                pushes++;
                //starts new round
                startRound();
            }
            else{
                System.out.println("Dealer has BlackJack. You lose.");
                dealer.printHand();
                losses++;
                //player lost, start a new round
                startRound();
            }
        }

        //check player score for 21
        if(player.hasBlackjack()){
            System.out.println("You have Blackjack! You win!");
            wins++;
            startRound();
        }

        //player choice
        player.makeDecision(deck, discarded);

        //check for bust
        if(player.getHand().calculatedValue() > 21){
            System.out.println("You have gone over 21.");
            losses ++;
            startRound();
        }

        //dealers turn
        dealer.printHand();
        while(dealer.getHand().calculatedValue()<17){
            dealer.hit(deck, discarded);
        }

        //win check - counts wins & losses
        if(dealer.getHand().calculatedValue()>21){
            System.out.println("Dealer busts");
            wins++;
        }
        else if(dealer.getHand().calculatedValue() > player.getHand().calculatedValue()){
            System.out.println("You lose.");
            losses++;
        }
        else if(player.getHand().calculatedValue() > dealer.getHand().calculatedValue()){
            System.out.println("You win.");
            wins++;
        }
        else{
            System.out.println("Push.");
            pushes++;
        }

        //new round start
        startRound();
    }

    //slow the game down to give the player time to breath
    public static void pause(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





}
