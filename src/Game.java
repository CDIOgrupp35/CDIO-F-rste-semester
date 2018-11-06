import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Game {
    private String pName1, pName2;
    private Dice masterDice = new Dice();
    private int winCon = 3000;
    Main main = new Main();
    private JSONObject jText = new JSONObject();
    JSONParser parser = new JSONParser();
    private boolean play = true;

    public Game(JSONObject jText) {
        this.jText = jText;
    }

    /**
     * Passes the turn to the next player
     */
    public void turnSwitch(Player playerOne, Player playerTwo) {
        playerOne.setTurn(true);
        playerTwo.setTurn(false);
    }

    public void playTurn(Player playerOne, Player playerTwo, int diceRoll){

        System.out.println((String) jText.get("rollP1") + diceRoll + jText.get("rollP2"));
        switch (diceRoll) {
            case 2:
                playerOne.balance.addPoints(250);
                System.out.println((String) jText.get("sq2"));
                break;
            case 3:
                playerOne.balance.subPoints(100);
                System.out.println((String) jText.get("sq3"));
                break;
            case 4:
                playerOne.balance.addPoints(100);
                System.out.println((String) jText.get("sq4"));
                break;
            case 5:
                playerOne.balance.subPoints(20);
                System.out.println((String) jText.get("sq5"));
                break;
            case 6:
                playerOne.balance.addPoints(180);
                System.out.println((String) jText.get("sq6"));
                break;
            case 7:
                System.out.println((String) jText.get("sq7"));
                break;
            case 8:
                playerOne.balance.subPoints(70);
                System.out.println((String) jText.get("sq8"));
                break;
            case 9:
                playerOne.balance.addPoints(60);
                System.out.println((String) jText.get("sq9"));
                break;
            case 10:
                playerOne.balance.subPoints(80);
                System.out.println((String) jText.get("sq10"));
                break;
            case 11:
                playerOne.balance.subPoints(50);
                System.out.println((String) jText.get("sq11"));
                break;
            case 12:
                playerOne.balance.addPoints(650);
                System.out.println((String) jText.get("sq12"));

                break;
            default:
                System.out.println("Error, you did not roll a value between 2 and 12");
                break;
        }

        System.out.println(playerOne.toString() + jText.get("balance") + playerOne.balance.getPoints());
        System.out.println(playerTwo.toString() + jText.get("balance") + playerTwo.balance.getPoints());
        if (diceRoll != 10) turnSwitch(playerTwo, playerOne);

    }

    public void winGame(Player player1, Player player2) {
        if (player1.balance.getPoints() >= winCon) {
            play = false;
            System.out.println(player1.toString() + jText.get("win"));
        } else if (player2.balance.getPoints() >= winCon) {
            play = false;
            System.out.println(player2.toString() + jText.get("win"));
        }
    }

    public void showTurn(Player player1, Player player2) {
        if (play) {
            if (player1.getIsTurn()) {
                System.out.println("\n " + player1.toString() + jText.get("turn"));
            } else if (player2.getIsTurn()) {
                System.out.println("\n " + player2.toString() + jText.get("turn"));
            }

        }
    }

    public void playing(int input, Player player1, Player player2) {
            if (input == 1) {
                if (player1.getIsTurn()){
                    masterDice.roll();
                    playTurn(player1, player2, masterDice.sum());
                }else {
                    masterDice.roll();
                    playTurn(player2, player1, masterDice.sum());

                    showTurn(player1, player2);
                    winGame(player1, player2);
                }
            }
        }
    public boolean getPlay(){return play;}
}
