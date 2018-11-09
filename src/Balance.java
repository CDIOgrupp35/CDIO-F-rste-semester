public class Balance {
    private int points;

    /**
     * A constructor for the balance class
     *
     * @param startBalance The balance that this class should initiate with.
     */
    public Balance (int startBalance){
        this.points = startBalance;
    }

    /**
     * A method for adding to the balance.
     *
     * @param points The amount to add to the balance
     */
    public void addPoints(int points){
        this.points+=points;
        if (this.points < 0){
            this.points = 0;
        }
    }

    /**
     * A method for subtracting from the balance.
     *
     * @param points The amount to subtract from the balance.
     */
    public void subPoints(int points){
        this.points -= points;
        if (this.points < 0){
            this.points = 0;
        }
    }

    /**
     * A method to get the current balance.
     *
     * @return The current amount of points in this balance.
     */
    public int getPoints(){
        return this.points;
    }

    /**
     * A setter to set the current balance.
     *
     * @param points The amount of points to se to the current balance.
     */
    public void setPoints(int points){
        this.points = points;
    }
}
