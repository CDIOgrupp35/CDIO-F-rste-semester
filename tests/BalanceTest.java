import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    Balance testBalance = new Balance(1000);

    /**Test the addPoints method when called with a positive value
     *
     * @ExpectedResult the balance equals 1500
     * @ActualResult the balance equals 1500
     * */

    // <
    @Test
    void testAddPointsPositive() {
        testBalance.addPoints(500);

        assertEquals(1500,testBalance.getPoints());
    }

    /**Test the addPoints method when called with a negaive value lager than the current balance
     *
     * @ExpectedResult: the balance is set to zero, as it may not take a negative value
     * @ActualResult: the balance equals zero
     * */
    @Test
    void testAddPointsNegative(){
        testBalance.addPoints(-1500);

        assertEquals(0, testBalance.getPoints());
    }

    /**Test the subPoints method when called with a value lager than the current balance
     *
     * @ExpectedResult: the balance is set to zero, as it may not take a negative value
     * @ActualResult: the balance equals zero
     * */
    @Test
    void testSubPoints() {
        testBalance.subPoints(1500);

        assertEquals(0, testBalance.getPoints());
    }
}