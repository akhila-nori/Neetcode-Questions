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
//Explanation -
// The "Moving Window" Mental Model
//Imagine you are walking down a street of shops. You want to buy a watch and sell it later.
//
//You see a shop: The watch is $100. You write down minPrice = 100.
//
//Next shop: The watch is $80. You think: "Forget the $100 shop, if I buy, I'm buying here!" You update minPrice = 80.
//
//Next shop: The watch is $150. You think: "If I sell the watch I bought for $80 here, I make $70." You check your high score. Is $70 better than $0? Yes. maxProfit = 70.
//
//Next shop: The watch is $60. You think: "Whoa, a new record low!" You update minPrice = 60.
//
//Crucial: You don't change your maxProfit yet because you haven't sold the $60 watch. You still have that $70 profit in your pocket from earlier.