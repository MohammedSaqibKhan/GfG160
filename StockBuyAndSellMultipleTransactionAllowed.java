public class StockBuyAndSellMultipleTransactionAllowed {


    public static int maximumProfit(int prices[]) {

        if(prices.length == 1) return 0;

        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1] ) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maximumProfit(new int[] {100, 180, 260, 310, 40, 535, 695}));
    }
}
