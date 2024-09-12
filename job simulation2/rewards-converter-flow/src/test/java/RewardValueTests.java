import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
void convert_from_cash_to_miles() {
    double cashValue = 100;  // 100 USD
    double expectedMiles = cashValue / 0.01;  // 1 USD = 100 miles
    var rewardValue = new RewardValue(cashValue);  // Assuming constructor takes cash value
    assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.001);
}

   @Test
void convert_from_miles_to_cash() {
    int milesValue = 10000;  // 10000 miles
    double expectedCash = milesValue * 0.01;  // 100 miles = 1 USD
    var rewardValue = new RewardValue(milesValue);  // Assuming constructor takes miles value
    assertEquals(expectedCash, rewardValue.getCashValue(), 0.001);
}

}
