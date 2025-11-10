//Leetcode 121
public class BestTimeToBuyAndSellStock {
    public int maxProfitOptimal(int[] prices) {
        int maxProfit=0, buyPrice=prices[0];

        for(int i=0; i<prices.length; i++){
            int currentProfit=prices[i]-buyPrice;
            if(prices[i]<buyPrice){
                buyPrice=prices[i];
            }else if(currentProfit>maxProfit){
                maxProfit=currentProfit;
            }
        }
        return maxProfit;
    }

    static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(solution.maxProfitOptimal(prices));
    }
}
