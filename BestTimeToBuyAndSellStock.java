public class BestTimeToBuyAndSellStock {
    public int maxprofit(int[] prices){
        int minprice=Integer.MAX_VALUE;
        int profit=0;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }else{
                 profit=prices[i]-minprice;
                 if(maxprofit<profit){
                    maxprofit=profit;
            }
            }
        }
        return maxprofit;
    }
}
