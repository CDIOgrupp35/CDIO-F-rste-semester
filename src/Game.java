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

    public void playTurn(Player player) {
        masterDice.roll();

        switch (masterDice.sum()) {
            case 2: score +=    //addToScore method in the player class needs editing before I can continue
        }
    }
}

