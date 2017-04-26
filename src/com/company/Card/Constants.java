package com.company.Card;

/**
 * Created by charlie on 4/25/2017.
 */
public class Constants {
    public enum Faces {
        TWO ("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"),
        NINE("9"), TEN("10"), JACK("Jack"), QUEEN("Queen"), KING("King"), ACE("Ace");

        private String value;
        Faces(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }
    }

    public enum Suits {
        CLUB("Club"), DIAMOND("Diamond"), HEART("Heart"), SPADE("Spade");

        private String value;
        Suits(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }
    }
}
