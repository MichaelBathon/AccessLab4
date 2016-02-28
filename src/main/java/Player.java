/**
 * Created by michaelbathon on 2/4/16.
 */
public class Player {

    private int playerNum;
    private int score = 0;


    Player(int playerNum){
        this.playerNum = playerNum;
    }

    public int getPlayerNum(){
        return this.playerNum;
    }

    public void setScore(int score){
        this.score += score;
    }

    public int getScore(){
        return this.score;
    }



}
