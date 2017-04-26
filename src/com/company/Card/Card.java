package com.company.Card;

import com.company.Card.Interfaces.ICard;

/**
 * Created by charlie on 4/25/2017.
 */
public class Card implements ICard {
    private Constants.Faces _face;
    private Constants.Suits _suit;

    public Constants.Suits getSuit() {
        return _suit;
    }
    public Constants.Faces getFace(){
        return _face;
    }

    public Card (Constants.Suits suit, Constants.Faces face){
        _suit = suit;
        _face = face;
    }

    public String name(){
        return this._face.getValue() + " of " + this._suit.getValue() + "s";
    }
}
