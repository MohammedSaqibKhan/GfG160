public class StockBuyAndSellMaxOneTransactionAllowed {

    // [7, 10, 1, 3, 6, 9, 2]
    public static int maximumProfit(int prices[]) {

        int minimumPriceSoFar = Integer.MAX_VALUE;
        int maximumProfit = 0;
        for (int price : prices) {
            minimumPriceSoFar = Math.min(minimumPriceSoFar, price);
            int profitIfSoldToday = price - minimumPriceSoFar;
            maximumProfit = Math.max(maximumProfit, profitIfSoldToday);
        }
        return maximumProfit;
    }


}
