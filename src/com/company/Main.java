package com.company;

import com.company.Card.Deck;
import com.company.Card.Interfaces.ICard;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();

        for(int i = 1; i < 54; i++){
            ICard card = deck.dealOneCard();
            System.out.println(card != null ? card.name() : "No more cards left in deck.");
        }

        System.out.println();
        System.out.println();

        deck = new Deck();
        deck.shuffle();
        for(int i = 1; i < 54; i++){
            ICard card = deck.dealOneCard();
            deck.shuffle();
            System.out.println(card != null ? card.name() : "No more cards left in deck.");
        }
    }
}
