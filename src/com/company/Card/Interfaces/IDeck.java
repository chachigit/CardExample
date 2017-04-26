package com.company.Card.Interfaces;

/**
 * Created by charlie on 4/25/2017.
 */
public interface IDeck {
    void shuffle();

    /**
     * @return Returns the first <code>ICard</code> from the deck. If there are no cards left, returns <code>null</code>.
     */
    ICard dealOneCard();
}
