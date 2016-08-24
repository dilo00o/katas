package tennis;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
/**
 * Created by Mircea
 */
public class TennisTest {

    Player player1;
    Player player2;
    Game game;

    @Before
    public void beforeGameTest() {
        player1 = new Player("Victor");
        player2 = new Player("Sarah");
        game = new Game(player1, player2);
    }

    @Test
    public void loveShouldBeDescriptionForScore0() {
        Game game = new Game(player1, player2);
        assertThat(game, hasProperty("score", is("love, love")));
    }


    @Test
    public void fifteenShouldBeDescriptionForScore1() {
        player2.winBall();
        assertThat(game, hasProperty("score", is("love, fifteen")));
    }

    @Test
    public void thirtyShouldBeDescriptionForScore2() {
        player1.winBall();
        player1.winBall();
        player2.winBall();
        assertThat(game, hasProperty("score", is("thirty, fifteen")));
    }

    @Test
    public void fortyShouldBeDescriptionForScore3() {
        IntStream.rangeClosed(1, 3).forEach((Integer) -> {
            player1.winBall();
        });
        assertThat(game, hasProperty("score", is("forty, love")));
    }

    @Test
    public void advantageShouldBeDescriptionWhenLeastThreePointsHaveNeenScoredByEachSideAndPlayerHasOnePointMoreThanHisOpponent() {
        IntStream.rangeClosed(1, 3).forEach((Integer) -> {
            player1.winBall();
        });
        IntStream.rangeClosed(1, 4).forEach((Integer) -> {
            player2.winBall();
        });
        assertThat(game, hasProperty("score", is("advantage Sarah")));
    }

    @Test
    public void deuceShouldBeDescriptionWhenAtLeastThreePointsHaveBeenScoredByEachPlayerAndTheScoresAreEqual() {
        for (int index = 1; index <= 3; index++) {
            player1.winBall();
        }
        for (int index = 1; index <= 3; index++) {
            player2.winBall();
        }
        assertThat(game, hasProperty("score", is("deuce")));
        player1.winBall();
        assertThat(game, hasProperty("score", is(not("deuce"))));
        player2.winBall();
        assertThat(game, hasProperty("score", is("deuce")));
    }


    @Test
    public void gameShouldBeWonByTheFirstPlayerToHaveWonAtLeastFourPointsInTotalAndWithAtLeastTwoPointsMoreThanTheOpponent() {
        for (int index = 1; index <= 4; index++) {
            player1.winBall();
        }
        for (int index = 1; index <= 3; index++) {
            player2.winBall();
        }
        assertThat(game, hasProperty("score", is(not("Victor won"))));
        assertThat(game, hasProperty("score", is(not("Sarah won"))));
        player1.winBall();
        assertThat(game, hasProperty("score", is("Victor won")));
    }

}