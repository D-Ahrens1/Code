/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author da129
 */
public class Deck {
    int faceValue;
    int suit;
    
   
    ArrayList<Card> DeckOfCards = new ArrayList();
    
    public void fillDeck(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 10; j++){
                Card c = new Card(i, j);
                DeckOfCards.add(c);
            }
        }
    }
    public Card draw(int CardFromTop){
        return DeckOfCards.get(DeckOfCards.size() - CardFromTop);
    }
    public void printAllCards(){
        System.out.println(DeckOfCards.toString());
    }
    
    public void shuffle(){
        Collections.shuffle(DeckOfCards);
    }
}
