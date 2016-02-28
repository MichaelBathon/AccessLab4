import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by michaelbathon on 2/4/16.
 */
public class Magpie {

    Deck deck = new Deck();
    /* made default access to test declareWinner method*/ private ArrayList<Player> players = new ArrayList<Player>();
    Scanner scan;
    int playerHand = 0;
    int numAces = 0;


    Magpie(){
        deck.buildDeck();
        deck.shuffleDeck();

    }

    private void startGame(){
        scan = new Scanner(System.in);
        System.out.println("How many players would you like to have?");
        int numPlayers = scan.nextInt();

        for(int i = 0; i < numPlayers; i++){
            players.add(new Player(i +1));
        }

        play();

    }

    private /* public Player, for testing changed return type and access */ void declareWinner(){
        Player winner = players.get(0);







        Collections.sort(players, new Comparator<Player>(){
            public int compare(Player p1, Player p2){
                if(p1.getScore() > p2.getScore()) return 1;
                else if(p1.getScore() < p2.getScore()) return -1;
                else return 0;
            }
        });
        int numPlayers =  players.size();
        int numTied = 0;

        for(int i = 0; i < numPlayers-1; i++){
            if(players.get(numPlayers - 1).getScore() == players.get(i).getScore()){
                numTied++;
            }
        }
        if(numTied == 0){
            System.out.println("Player " + players.get(numPlayers - 1).getPlayerNum() + " is the winner!");
        }
        else if(numTied >= 1){
            //winner = players.get(0);
            int lowestPlayerNum = 0;
            for(int i = (numPlayers-1); i >= ((numPlayers-1) - numTied); i--){
                if(lowestPlayerNum == 0){
                    lowestPlayerNum = players.get(i).getPlayerNum();
                }
                if (players.get(i).getPlayerNum() == 1){
                    winner = players.get(i);
                }
                else if(players.get(i).getPlayerNum() < lowestPlayerNum){
                    winner = players.get(i);
                    lowestPlayerNum = players.get(i).getPlayerNum();
                }
            }
            System.out.println("Player " + lowestPlayerNum + " is the winner, because they have the lowest player number.");
        }

        // return winner; returned Player winner for testing purposes
    }


    public void play(){
        Card dealtCard = deck.drawCard();

        if(dealtCard.rank != "Ace"){
            System.out.println("Player " + players.get(playerHand).getPlayerNum() + " drew a " + dealtCard.rank + " of " + dealtCard.suit +
            " for " + dealtCard.pointValue + " points");
            players.get(playerHand).setScore(dealtCard.pointValue);
            play();
        } else {
            System.out.println("Player " + players.get(playerHand).getPlayerNum() + " drew an " + dealtCard.rank + " of " + dealtCard.suit +"!");
            numAces++;
            if(numAces == 4){
                for(Player p : players)
                    System.out.println("Player " + p.getPlayerNum() + " scored " + p.getScore());
                declareWinner();
                return;
            }
            if(playerHand < players.size() - 1)
                playerHand++;
            play();
        }

    }


    public static void main(String[] args) {

        Magpie game = new Magpie();
        game.startGame();

    }


}
