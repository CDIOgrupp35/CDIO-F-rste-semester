import org.json.simple.JSONObject;

public class Game {
    private String pName1, pName2;
    private Dice masterDice = new Dice();
    private Player firstPlayer = new Player(pName1);
    private Player secondPlayer = new Player(pName2);
    JSONObject jText = new JSONObject();

    public Game(Player player1, Player player2, Dice dice1, String playerName1, String playerName2) {
        firstPlayer = player1;
        secondPlayer = player2;
        masterDice = dice1;
        pName1 = playerName1;
        pName2 = playerName2;
    }

    /** Passes the turn to the next player */
    public void turnSwitch(Player playerOne, Player playerTwo){
        playerOne.setTurn(true);
        playerTwo.setTurn(false);
    }

    public void playTurn(Player playerOne, Player playerTwo) {
        masterDice.roll();

        switch (masterDice.sum()) {
            case 2: playerOne.addToScore(250);
                System.out.println("You hit " + masterDice.sum() + ", the Tower, and got 250 points!");
                break;
            case 3: playerOne.subFromScore(100);
                System.out.println("You hit " + masterDice.sum() + ", the Crater, and lost 100 points!");
                break;
            case 4: playerOne.addToScore(100);
                System.out.println("You hit " + masterDice.sum() + ", the Palace gates, and got 100 points!");
                System.out.println("Your score is now " + playerOne.getScore());
                turnSwitch(playerTwo, playerOne);
                break;
            case 5: playerOne.subFromScore(20);
                System.out.println("You hit " + masterDice.sum() + ", the Cold Desert, and lost 20 points!");
                break;
            case 6: playerOne.addToScore(180);
                System.out.println("You hit " + masterDice.sum() + ", the Walled city, and got 180 points!");
                break;
            case 7:
                System.out.println("You hit " + masterDice.sum() + ", the Monastery, and got 0 points!");
                break;
            case 8: playerOne.subFromScore(70);
                System.out.println("You hit " + masterDice.sum() + ", the Cold Desert, and lost 70 points!");
                break;
            case 9: playerOne.addToScore(60);
                System.out.println("You hit " + masterDice.sum() + ", the Huts in the mountain, and got 60 points!");
                break;
            case 10: playerOne.subFromScore(80);
                System.out.println("You hit " + masterDice.sum() + ", the Werewall, and lost 80 points!");
                break;
            case 11: playerOne.subFromScore(50);
                System.out.println("You hit " + masterDice.sum() + ", the Pit, and lost 50 points!");
                break;
            case 12: playerOne.addToScore(650);
                System.out.println("Jackpot!!! You hit " + masterDice.sum() + ", the Goldmine, and got 650 points!");

                break;
            default:
                System.out.println("Error, you did not roll a value between 2 and 12");
                break;
        }
        System.out.println((String) jText.get("score") + playerOne.getScore());
        if(masterDice.sum() != 10)turnSwitch(playerTwo, playerOne);
    }
}

