package com.company.Card.Interfaces;

import com.company.Card.Constants;

/**
 * Created by charlie on 4/25/2017.
 */
public interface ICard {
    Constants.Suits getSuit();
    Constants.Faces getFace();
    String name();
}
