import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Game {
    private String pName1, pName2;
    private Dice masterDice = new Dice();
    private Player firstPlayer;
    private Player secondPlayer;
    Main main = new Main();
    JSONObject jText = new JSONObject();
    JSONParser parser = new JSONParser();

    public Game(Player player1, Player player2, Dice dice1, String playerName1, String playerName2) {
        firstPlayer = player1;
        secondPlayer = player2;
        masterDice = dice1;
        pName1 = playerName1;
        pName2 = playerName2;
    }
    public Game(Player player1, Player player2){
        firstPlayer = player1;
        secondPlayer = player2;
    }

    /** Passes the turn to the next player */
    public void turnSwitch(Player playerOne, Player playerTwo){
        playerOne.setTurn(true);
        playerTwo.setTurn(false);
    }

    public void playTurn(Player playerOne, Player playerTwo) {
        masterDice.roll();
        try{
            Object obj = parser.parse(new FileReader(main.getJFile()));
            JSONObject jobj = (JSONObject) obj;
            System.out.println((String) jobj.get("rollP1") + masterDice.sum()+  jobj.get("rollP2"));
        switch (masterDice.sum()) {
            case 2: playerOne.addToScore(250);
                System.out.println((String) jobj.get("sq2"));
                break;
            case 3: playerOne.subFromScore(100);
                System.out.println((String) jobj.get("sq3"));
                break;
            case 4: playerOne.addToScore(100);
                System.out.println((String) jobj.get("sq4"));
                break;
            case 5: playerOne.subFromScore(20);
                System.out.println((String) jobj.get("sq5"));
                break;
            case 6: playerOne.addToScore(180);
                System.out.println((String) jobj.get("sq6"));
                break;
            case 7:
                System.out.println((String) jobj.get("sq7"));
                break;
            case 8: playerOne.subFromScore(70);
                System.out.println((String) jobj.get("sq8"));
                break;
            case 9: playerOne.addToScore(60);
                System.out.println((String) jobj.get("sq9"));
                break;
            case 10: playerOne.subFromScore(80);
                System.out.println((String) jobj.get("sq10"));
                break;
            case 11: playerOne.subFromScore(50);
                System.out.println((String) jobj.get("sq11"));
                break;
            case 12: playerOne.addToScore(650);
                System.out.println((String) jobj.get("sq12"));

                break;
            default:
                System.out.println("Error, you did not roll a value between 2 and 12");
                break;
        }
        if(playerOne.getIsTurn())
            System.out.print(playerOne.toString());
        else
            System.out.print(playerTwo.toString());
        System.out.println((String) jobj.get("balance") + playerOne.getScore());
        if(masterDice.sum() != 10)turnSwitch(playerTwo, playerOne);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ParseException f){
            f.printStackTrace();
        }}
}

