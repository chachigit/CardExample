package com.company.Card;

import java.util.EnumSet;

/**
 * Created by charlie on 1/19/2018.
 */
public class PinochleDeck extends Deck {
    public PinochleDeck(){
        super();

        // initialize standard 48 card pinochle deck.
        // two copies each of 9, 10, jack, king, queen, ace - for all suits.
        for(Constants.Suits s : Constants.Suits.values()){
            EnumSet<Constants.Faces> pinochleSet = EnumSet.range(Constants.Faces.NINE, Constants.Faces.ACE);

            for(Constants.Faces f : pinochleSet){
                cards.add(new Card(s, f));
                cards.add(new Card(s, f));
            }
        }
    }
}
