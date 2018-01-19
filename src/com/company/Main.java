package com.company;

import com.company.Card.Deck;
import com.company.Card.Interfaces.ICard;
import com.company.Card.StandardDeck;
import com.company.Card.PinochleDeck;

public class Main {

    public static void main(String[] args) {
        Deck deck = new PinochleDeck();

        for(int i = 1; i < 54; i++){
            ICard card = deck.dealOneCard();
            System.out.println(card != null ? card.name() : "No more cards left in deck.");
        }

        System.out.println();
        System.out.println();

        deck = new StandardDeck();
        deck.shuffle();
        for(int i = 1; i < deck.getLength(); i++){
            ICard card = deck.dealOneCard();
            deck.shuffle();
            System.out.println(card != null ? card.name() : "No more cards left in deck.");
        }
    }
}
