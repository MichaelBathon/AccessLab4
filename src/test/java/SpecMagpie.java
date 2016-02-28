import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


/**
 * Created by michaelbathon on 2/7/16.
 */
public class SpecMagpie {

    @Test
    public void testBuildDeck(){
        Deck deck1 = new Deck();
        int x = 52;

        deck1.buildDeck();

        assertNotNull("Fails if the deck isn't filled with 52 Cards", deck1.getDeck().get(51));

        assertEquals("Fails if the size of the deck isn't equal to the expected size of 52", x, deck1.getDeck().size());

        assertEquals("Fails if the Card if the fourth Card added isn't the Ace of Diamonds", deck1.getDeck().get(3), Card.ACED);

    }

    @Test
    public void testDeclareWinner(){

       /* Magpie maggie = new Magpie(); CAN ONLY TEST WITH THE COMMENTED CHANGES IN MAGPIE CLASS


        maggie.players.add(new Player(1));
        maggie.players.add(new Player(2));

        maggie.players.get(0).setScore(150);
        maggie.players.get(1).setScore(150);

        Player expectedWinner = maggie.declareWinner();


        assertEquals("Fails if the winner in a tie isn't the lowest numbered player", expectedWinner, maggie.players.get(0)); */






    }








}
