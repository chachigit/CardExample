package com.company.Card;

import java.security.SecureRandom;
import java.util.ArrayList;

/**
 * Created by charlie on 1/19/2018.
 */
public class StandardDeck extends Deck{
    public StandardDeck(){
        super();

        // initialize default standard deck.
        // 1 card for each Suit and Face in a standard deck.
        for(Constants.Suits s : Constants.Suits.values()){
            for(Constants.Faces f : Constants.Faces.values()){
                cards.add(new Card(s, f));
            }
        }
    }
}
