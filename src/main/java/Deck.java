import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by michaelbathon on 2/4/16.
 */
public class Deck {

    private ArrayList<Card> deck;
    public Deck(){
        deck = new ArrayList<Card>();
    }
    /*private String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs" };
    private String[] rank = {"Ace", "2", "3", "4","5","6","7","8","9","10","Jack","Queen","King" };
    public enum RankEnum {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }*/


    public void buildDeck(){
        for(Card c : Card.values()){
            deck.add(c);
        }

    }

    public void shuffleDeck(){
        Collections.shuffle(deck);

    }
    public Card drawCard(){
        Card removedCard = null;
        if(deck.get(0) != null){
        removedCard = deck.remove(0);}
        return removedCard;
    }
    public ArrayList<Card> getDeck(){
        return deck;
    }





}
