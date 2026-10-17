class Solution {
    int res = 0;
    public int subsetXORSum(int[] nums) {
        return xorSum(nums, 0, 0);
    }
    public int xorSum (int[] nums, int i, int sum){
        if(i == nums.length) return sum;

        int choose = xorSum(nums, i + 1, sum ^ nums[i]);
        int notChoose = xorSum(nums, i + 1, sum);

        return choose + notChoose;
    }
}