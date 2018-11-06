public class Balance {
    private int points;

    public Balance (int startBalance){
        this.points = startBalance;
    }

    public void addPoints(int points){
        this.points+=points;
        if (this.points < 0){
            this.points = 0;
        }
    }

    public void subPoints(int points){
        this.points -= points;
        if (this.points < 0){
            this.points = 0;
        }
    }

    public int getPoints(){
        return this.points;
    }

    public void setPoints(int points){
        this.points = points;
    }
}
