public class Game {
    private String pName1, pName2;
    private Dice masterDice = new Dice();
    private Player firstPlayer = new Player(pName1);
    private Player secondPlayer = new Player(pName2);

    public Game(Player player1, Player player2, Dice dice1, String playerName1, String playerName2) {
        firstPlayer = player1;
        secondPlayer = player2;
        masterDice = dice1;
        pName1 = playerName1;
        pName2 = playerName2;
    }

    /** Passes the turn to the next player */
    public void turnSwitch(Player playerOne){
        isTurn = false;
        playerOne.isTurn = true;
    }

    public void playTurn(Player player) {
        masterDice.roll();

        switch (masterDice.sum()) {
            case 2: player.addToScore(250);
                System.out.println("You hit " + masterDice.sum() + ", the Tower, and got 250 points!");
                System.out.println("Your score is now " + player.getScore());
                player.turnSwitch(); // TODO Fix the turnSwitch for the whole switch case.
                break;
            case 3: player.subFromScore(100);
                System.out.println("You hit " + masterDice.sum() + ", the Crater, and lost 100 points!");
                System.out.println("Your score is now " + player.getScore());
                player.turnSwitch();
                break;
            case 4: player.addToScore(100);
                System.out.println("You hit " + masterDice.sum() + ", the Palace gates, and got 100 points!");
                System.out.println("Your score is now " + player.getScore());
                player.turnSwitch();
                break;
            case 5: player.subFromScore(20);
                System.out.println("You hit " + masterDice.sum() + ", the Cold Desert, and lost 20 points!");
                System.out.println("Your score is now " + player.getScore());
                player.turnSwitch();
                break;
            case 6: player.addToScore(180);
                System.out.println("You hit " + masterDice.sum() + ", the Walled city, and got 180 points!");
                System.out.println("Your score is now " + player.getScore());
                player.turnSwitch();
                break;
            case 7:
                System.out.println("You hit " + masterDice.sum() + ", the Monastery, and got 0 points!");
                System.out.println("Your score is still " + player.getScore());
                player.turnSwitch();
                break;
            case 8: player.subFromScore(70);
                System.out.println("You hit " + masterDice.sum() + ", the Cold Desert, and lost 70 points!");
                System.out.println("Your score is now " + player.getScore());
                player.turnSwitch();
                break;
            case 9: player.addToScore(60);
                System.out.println("You hit " + masterDice.sum() + ", the Huts in the mountain, and got 60 points!");
                System.out.println("Your score is now " + player.getScore());
                player.turnSwitch();
                break;
            case 10: player.subFromScore(80);
                System.out.println("You hit " + masterDice.sum() + ", the Werewall, and lost 80 points!");
                System.out.println("Your score is now " + player.getScore());
                System.out.println("You get an extra turn, roll again");
                break;
            case 11: player.subFromScore(50);
                System.out.println("You hit " + masterDice.sum() + ", the Pit, and lost 50 points!");
                System.out.println("Your score is now " + player.getScore());
                player.turnSwitch();
                break;
            case 12: player.addToScore(650);
                System.out.println("Jackpot!!! You hit " + masterDice.sum() + ", the Goldmine, and got 650 points!");
                System.out.println("Your score is now " + player.getScore());
                player.turnSwitch();
                break;
            default:
                System.out.println("Error, you did not roll a value between 2 and 12");
                break;
        }
    }
}

