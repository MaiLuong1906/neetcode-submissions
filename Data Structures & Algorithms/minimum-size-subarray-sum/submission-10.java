class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = 10001, l = 0, r = 0, sum = 0;
        while(r < nums.length && l < nums.length){
            sum += nums[r];
            r++;
            while(sum >= target){
                res = Math.min(res, r - l);
                sum -= nums[l];
                l++;
            }
        }
        return res == 10001 ? 0 : res;
    }
}