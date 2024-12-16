package Array;

public class BestTimeToBuySellStocks {
    public int maxProfit(int[] prices) {
        //[7,1,5,3,6,4]
        int max=0, min=prices[0];
        for (int i = 1; i < prices.length ; i++) {
            max = Math.max(max, prices[i]-min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}
