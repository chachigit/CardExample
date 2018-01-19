package com.company;

import com.company.Card.Deck;
import com.company.Card.Interfaces.ICard;
import com.company.Card.StandardDeck;
import com.company.Card.PinochleDeck;

public class Main {

    public static void main(String[] args) {
        Deck deck = new PinochleDeck();

        // pinochle has 48 cards. Looping to 54 to demonstrate that dealOneCard returns null if there are no more cards in the deck.
        for(int i = 1; i < 54; i++){
            ICard card = deck.dealOneCard();
            System.out.println(card != null ? card.name() : "No more cards left in deck.");
        }

        System.out.println();
        System.out.println();

        deck = new StandardDeck();
        deck.shuffle();
        // iterate to deck.getLength => will not get a null from the deck.
        for(int i = 1; i < deck.getLength(); i++){
            ICard card = deck.dealOneCard();
            
            // shuffle the deck every time.
            deck.shuffle();
            System.out.println(card != null ? card.name() : "No more cards left in deck.");
        }
    }
}
