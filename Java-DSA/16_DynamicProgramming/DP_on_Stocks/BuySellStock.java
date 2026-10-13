import java.util.*;

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        
        System.out.println("Max profit (one transaction): " + maxProfitOnce(prices));
        System.out.println("Max profit (unlimited): " + maxProfitUnlimited(prices));
    }
    
    // Best Time to Buy and Sell Stock I
    static int maxProfitOnce(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        
        return maxProfit;
    }
    
    // Best Time to Buy and Sell Stock II
    static int maxProfitUnlimited(int[] prices) {
        int profit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        
        return profit;
    }
}
