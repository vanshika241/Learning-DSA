public class StockBuySell2 {
        public int maximumProfit(int prices[]) {
            int n = prices.length;
            int min = prices[0];
            int maxi = Integer.MIN_VALUE;
            for(int i=1;i<n;i++){
                int cost =  prices[i]-min;
                maxi = Math.max(maxi, cost);
                min = Math.min(min, prices[i]);
            }
            return maxi;
        }

}
