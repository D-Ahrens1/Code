/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;

/**
 *
 * @author da129
 */
public class Card {
    private int suit, value;
    private String[] cardSuit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    private String[] cardValue = {"Ace", "2", "3", "4", "5",
                                   "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};

    public Card(int cSuit, int cValue)
    {
        suit = cSuit; 
        value = cValue;
    }

    public String toString()
    {
        String cardInfo = cardValue[value] + cardSuit[suit];

        return cardInfo;
    }
    public int getFace(){
        return value;
    }
    public int getSuit(){
        return suit;
    }
    public String getImage(){
        return cardValue[value] + cardSuit[suit] + ".png";
    }

}
