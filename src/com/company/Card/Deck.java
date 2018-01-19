package com.company.Card;

import com.company.Card.Interfaces.ICard;
import com.company.Card.Interfaces.IDeck;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by charlie on 4/25/2017.
 */
public abstract class Deck implements IDeck {
    protected ArrayList<ICard> cards;
    protected SecureRandom random;

    public Deck(){
        random = new SecureRandom();
        cards = new ArrayList<>();

        // up to concrete classes to fill the deck of cards.
    }
    
    public int getLength() {
        return cards.size();
    }

    @Override
    public void shuffle() {
        int length = cards.size();
        // Knuth / Fisher-Yates implementation.
        for(int i = 0; i < length; i++){
            // use Collections.Swap.
            Collections.swap(cards, i, random.nextInt(length - i) + i);
        }
    }


    /**
     * @return Returns the first <code>ICard</code> from the deck. If there are no cards left, returns <code>null</code>.
     */
    @Override
    public ICard dealOneCard() {
        return cards.size() > 0 ? cards.remove(0) : null;
    }
}
