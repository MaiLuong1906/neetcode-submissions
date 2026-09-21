class Solution {
    public int maxProfit(int[] prices) {
        int res = 0, l = 0, r = 1;
        for(int i = 0; i < prices.length; i ++){
            for(int j = i + 1; j < prices.length; j++){
                if(prices[j] - prices[i] > res){
                    res = prices[j] - prices[i];
                }
            }
        }
        return res;
    }
}
