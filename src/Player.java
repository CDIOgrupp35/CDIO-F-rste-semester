public class Player {
    Balance balance;
    private boolean isTurn;
    private String playerName;

    /** Constructor, creates a instance of the class: balance.
     *
     * @param playerName The name of the player.*/
    public Player(String playerName){
        this.playerName = playerName;
        this.balance = new Balance(1000);
    }

    /** Boolean for what player has the turn *
     *
     * @return the internal isTurn boolean
     */
    public boolean getIsTurn(){
        return isTurn;
    }

    /** Boolean for setting the turn to a player */
    public void setTurn(boolean turn) {
        isTurn = turn;
    }


    /**
     * A string containing the player's name
     *
     * @return The player's name.
     */
    public String toString() {
        return playerName;
    }

}
