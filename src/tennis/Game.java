package tennis;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Mircea on
 */
public class Game {
    Player player1;
    Player player2;
    List<String> scoreAsString = Arrays.asList("love", "fifteen", "thirty", "forty");

    public String getScore() {
        buildScore();
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void buildScore() {
        int player1Score = player1.getScore();
        int player2Score = player2.getScore();
        if (player1Score < 3 && player2Score < 3)
            this.score = scoreAsString.get(player1Score) + ", " + scoreAsString.get(player2Score);
        else if (player1Score >= 3 && player2Score >= 3) {
            if (player1Score == player2Score)
                this.score = "deuce";
            else if (Math.abs(player1Score - player2Score) < 2)
                this.score = player1Score > player2Score ? "advantage " + player1.getPlayerName() : "advantage " + player2.getPlayerName();
            else
                this.score = player1Score > player2Score ? player1.getPlayerName() + " won" : player2.getPlayerName() + " won";
        } else this.score = scoreAsString.get(player1Score) + ", " + scoreAsString.get(player2Score);
    }

    String score;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        buildScore();
    }
}
