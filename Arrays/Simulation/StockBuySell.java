public class StockBuySell{
        public int maximumProfit(int prices[]) {
         int totalProfit = 0;
         int n = prices.length;
         for(int i=1;i<n;i++){
            if (prices[i]>prices[i-1]) {
                totalProfit += prices[i]-prices[i-1];
            }
         }
         return totalProfit;
        }
}
