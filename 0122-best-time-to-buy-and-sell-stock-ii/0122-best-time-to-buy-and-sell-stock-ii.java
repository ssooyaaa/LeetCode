class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        int buy = 0;
        int sell = 1;
        
        while(sell<prices.length){
            if(prices[sell]<prices[buy]){
                buy = sell;
                sell++;
            }else{
                if(sell<prices.length-1 && prices[sell]>prices[sell+1]){
                    max += (prices[sell]-prices[buy]);
                    buy = sell;
                    sell = buy+1;
                }else if(sell>=prices.length-1){
                    max += prices[sell]-prices[buy];
                    sell++;
                }else
                    sell++;
            }
        }
        
        return max;
    }
}