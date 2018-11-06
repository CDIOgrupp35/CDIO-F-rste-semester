import java.util.Random;

public class Dice {
    private int faceValue1;
    private int faceValue2;
    private int _sum;
    private Random random = new Random();

    /**
     * Throws one die and generates a value between 1-6
     */
    public void roll() {
        this.faceValue1 = random.nextInt(6) + 1;
        this.faceValue2 = random.nextInt(6) + 1;

    }

    /**
     * Returns the face value of the die
     */
    /*public int getFaceValue(){
        return this.faceValue1;
    }
    /**

    /** Compares the face value of two dice objects */
    /*public boolean equals(Dice another){
        if (this.faceValue1 == another.faceValue1){
            return true;
        }else
            return false;
    }
    /**


    /** Sums the face value of two dice objects */
    public int sum() {
        this._sum = this.faceValue1 + this.faceValue2;
        return this._sum;
    }

    public int setFaceValue1(int i) {
        return this.faceValue1 = i;
    }

    public int setFaceValue2(int i) {
        return this.faceValue2 = i;
    }

    public int getFaceValue1() {
        return this.faceValue1;
    }

    public int getFaceValue2() {
        return this.faceValue2;
    }

    public int getSetSum(int i) {
        this._sum = i;

        return this._sum;
    }


}










