package com.company.Card;

import com.company.Card.Interfaces.ICard;
import com.company.Card.Interfaces.IDeck;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by charlie on 4/25/2017.
 */
public class Deck implements IDeck {
    private ArrayList<ICard> cards;
    private SecureRandom random;

    public Deck(){
        random = new SecureRandom();

        // initialize default standard deck.
        // 1 card for each Suit and Face in a standard deck.
        // TODO: refactor this to abstract out the kind of deck created. Standard deck is an assumption.
        cards = new ArrayList<>();
        for(Constants.Suits s : Constants.Suits.values()){
            for(Constants.Faces f : Constants.Faces.values()){
                cards.add(new Card(s, f));
            }
        }
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
            // swap(i, random.nextInt(length - i) + i);
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

    //private void swap(int a, int b){
    //    ICard temp = cards.get(a);
    //    cards.set(a, cards.get(b));
    //    cards.set(b, temp);
    //}
}
