package test.java.tennis;

import main.java.tennis.Player;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
/**
 * Created by Mircea
 */
public class PlayerTest {

    @Test
    public void pointsCanBeAddedToEachPlayer() {
        Player victor = new Player("Al");
        Player sarah = new Player("Mia");
        IntStream.rangeClosed(1, 3).forEach((Integer) -> {
            victor.winBall();
        });
        IntStream.rangeClosed(1, 4).forEach((Integer) -> {
            sarah.winBall();
        });
        assertThat(victor, hasProperty("score", is(3)));
        assertThat(sarah, hasProperty("score", is(4)));
    }
}