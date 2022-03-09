import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BuyAndSellTest {

    @Test
    void buyAndSellM() {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int expected1 = 7;

        int[] prices2 = {1, 2, 3, 4, 5};
        int expected2 = 4;

        int[] prices3 = {7, 6, 4, 3, 1};
        int expected3 = 0;

        Assertions.assertEquals(expected1, BuyAndSell.buyAndSellM(prices1));
        Assertions.assertEquals(expected2, BuyAndSell.buyAndSellM(prices2));
        Assertions.assertEquals(expected3, BuyAndSell.buyAndSellM(prices3));


    }
}