import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameIntegrationTest {

    Player testPlayer1 = new Player("player1");
    Player testPlayer2 = new Player("player2");
    Game testGame = new Game(new JSONObject());

    /**Tests whether the turnSwitch() method swap the isTurn value of two players.
     *
     * @ExpectedResult The isTurn values of the players have swapped. The isTurn for testPlayer1 is false and true for testplayer2
     * @ActualResult The isTurn for testPlayer1 is false and true for testplayer2
     * */
    @Test
    void turnSwitch() {
        testPlayer1.setTurn(true);
        testPlayer2.setTurn(false);

        assertTrue(testPlayer1.getIsTurn());
        assertFalse(testPlayer2.getIsTurn());

        testGame.turnSwitch(testPlayer2,testPlayer1);

        assertFalse(testPlayer1.getIsTurn());
        assertTrue(testPlayer2.getIsTurn());
    }

    /**Tests whether the playTurn() method change the balance of a player accordingly to ? and swap the isTurn value of the players afterward.
     *
     * @ExpectedResult The balance of testPlayer1 is 930e and the isTurn for is  swapped to false and true for testplayer2
     * @ActualResult testPlayer1s' balance is 930 and isTurn is false and true for testplayer2
     * */
    @Test
    void playTurn() {
        testPlayer1.setTurn(true);
        testPlayer2.setTurn(false);

        testGame.playTurn(testPlayer1,testPlayer2, 8);

        assertEquals(930,testPlayer1.balance.getPoints());
        assertFalse(testPlayer1.getIsTurn());
        assertTrue(testPlayer2.getIsTurn());
    }

    /**Tests whether the winGame() method changes the value of the boolean play to false when a players balance becomes or exceed 3000
     *
     * @ExpectedResult The boolean play is false
     * @ActualResult play is successfully changed to false
     * */
    @Test
    void winGame() {
        testPlayer1.balance.setPoints(3000);
        testGame.winGame(testPlayer1,testPlayer2);

        assertFalse(testGame.getPlay());
    }
}