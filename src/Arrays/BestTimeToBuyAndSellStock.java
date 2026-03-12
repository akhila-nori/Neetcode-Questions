package Arrays;

class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int boughtPrice = prices[0];
        int maxProfitMake = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] < boughtPrice){
                boughtPrice = prices[i];
            } else {
                int currentProfitMake = prices[i] - boughtPrice;
                maxProfitMake = Math.max(maxProfitMake,currentProfitMake);
            }
        }
        return maxProfitMake;
    }
}