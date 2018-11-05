public class Player {
    Balance balance;
    private int winCon = 3000; // TODO Flyttes senere, forbiliver for nu
    private boolean isTurn;
    private String playerName;

    /** Constructor, creates a instance of the class: player. */
    public Player(String playerName){
        this.playerName = playerName;
        this.balance = new Balance(1000);
    }

//    /** Adds an int to a players score */
//    public void addToScore(int addInt){
//        this.score = this.score + addInt;
//    }
//
//    /** Subtracts an int from a players score */
//    public void subFromScore(int subInt){
//        this.score = this.score - subInt;
//    }


    /** Boolean for what player has the turn */
    public boolean getIsTurn(){
        return isTurn;
    }

    /** Boolean for setting the turn to a player */
    public void setTurn(boolean turn) {
        isTurn = turn;
    }


    /** If 'score' is higher or equals to the winCon, winGame is true. */
    public boolean winGame(){
        if(score>=winCon)
            return true;
        else
            return false;

    }

    public String toString() {
        return playerName;
    }

    public int getScore(){
        return score;
    }


    public void setScore(int newScore){
        score = newScore;
    }
}
