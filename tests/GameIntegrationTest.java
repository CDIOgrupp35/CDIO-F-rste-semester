import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameIntegrationTest {

    Player testPlayer1 = new Player("player1");
    Player testPlayer2 = new Player("player2");

    Game testGame = new Game(new JSONObject());

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

    @Test
    void playTurn() {
        testPlayer1.setTurn(true);
        testPlayer2.setTurn(false);

        testGame.playTurn(testPlayer1,testPlayer2, 8);

        assertEquals(930,testPlayer1.balance.getPoints());
        assertFalse(testPlayer1.getIsTurn());
        assertTrue(testPlayer2.getIsTurn());
    }

    @Test
    void winGame() {
        testPlayer1.balance.setPoints(3000);
        testGame.winGame(testPlayer1,testPlayer2);

        assertFalse(testGame.getPlay());
    }
}