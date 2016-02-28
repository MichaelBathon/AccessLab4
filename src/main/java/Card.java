/**
 * Created by michaelbathon on 2/4/16.
 */

enum Card{

    ACEH("Ace", "Hearts", 0), ACES("Ace", "Spades", 0), ACEC("Ace", "Clubs", 0), ACED("Ace", "Diamonds", 0),

    KINGH("King", "Hearts", 22), KINGS("King", "Spades", 20), KINGC("King", "Clubs", 20), KINGD("King", "Diamonds", 22),

    QUEENH("Queen", "Hearts", 18), QUEENS("Queen", "Spades", 14), QUEENC("Queen", "Clubs", 14), QUEEND("Queen", "Diamonds", 18),

    JACKH("Jack", "Hearts", 15), JACKS("Jack", "Spades", 15), JACKC("Jack", "Clubs", 15), JACKD("Jack", "Diamonds", 15),

    TENH("Ten", "Hearts", 0), TENS("Ten", "Spades", 0), TENC("Ten", "Clubs", 0), TEND("Ten", "Diamonds", 0),

    NINEH("Nine", "Hearts", 9), NINES("Nine", "Hearts", 9), NINEC("Nine", "Hearts", 9), NINED("Nine", "Hearts", 9),

    EIGHTH("Eight", "Hearts", 0), EIGHTS("Eight", "Spades", 0), EIGHTC("Eight", "Clubs", 0), EIGHTD("Eight", "Diamonds", 0),

    SEVENH("Seven", "Hearts", 7), SEVENS("Seven", "Spades", 7), SEVENC("Seven", "Clubs", 7), SEVEND("Seven", "Diamonds", 7),

    SIXH("Six", "Hearts", 0), SIXS("Six", "Spades", 0), SIXC("Six", "Clubs", 0), SIXD("Six", "Diamonds", 0),

    FIVEH("Five", "Hearts", 5), FIVES("Five", "Spades", 5), FIVEC("Five", "Clubs", 5), FIVED("Five", "Diamonds", 5),

    FOURH("Four", "Hearts", 0), FOURS("Four", "Spades", 0), FOURC("Four", "Clubs", 0), FOURD("Four", "Diamonds", 0),

    THREEH("Three", "Hearts", 3), THREES("Three", "Spades", 3), THREEC("Three", "Clubs", 3), THREED("Three", "Diamonds", 3),

    TWOH("Two", "Hearts", 0), TWOS("Two", "Spades", 0), TWOC("Two", "Clubs", 0), TWOD("Two", "Diamonds", 0);


    String rank = "";
    String suit = "";
    int pointValue = 0;

    Card(String rank, String suit, int points){
        this.rank = rank;
        this.suit = suit;
        this.pointValue = points;
    }
}


/*public class Card {



    private Rank rank;
    private Suit suit;
    private int pointValue = 0;

    Card(Rank rank, Suit suit, int pointValue){
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;


    }












   private String suit;
    private String rank;
    private Deck.RankEnum rankEnum;
    public Card(String suit, String rank, Deck.RankEnum rankE){
        this.suit = suit;
        this.rank = rank;
        this.rankEnum = rankE;
    }

    public String getSuit(){return suit;}
    public String getRank(){
        return rank;
    }
    public Deck.RankEnum getRankEnum() { return rankEnum;}




} */
