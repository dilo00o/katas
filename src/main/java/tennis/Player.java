package main.java.tennis;

import java.util.Arrays;
import java.util.List;
/**
 * Created by Mircea
 */
public class Player {
    String playerName;
    List<String> scoreAsString = Arrays.asList("love", "fifteen", "thirty", "forty");

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    int score;

    public Player(String name) {
        playerName = name;
    }

    public void winBall() {
        score += 1;
    }

    public String scoreAsString() {
        return scoreAsString.get(score);
    }
}
