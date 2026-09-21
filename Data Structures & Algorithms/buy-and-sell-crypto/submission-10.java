class Solution {
    public int maxProfit(int[] prices) {
        int res = 0, left = 0, right = 0;
        while(right < prices.length){
            if(prices[right] < prices[left]){
                left = right;
            }
            else{
                res = Math.max(res, prices[right] - prices[left]);
            }
            right ++;
        }
        return res;
    }
}
