class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int x: nums){
            sum += x;
        }
        if(sum % k != 0) return false;

        int target = sum / k;
        Arrays.sort(nums);
        int[] sides = new int[k];
        return backtrack(nums, sides, nums.length - 1, k, target);
    }
    public boolean backtrack(int[] nums, int[] sides, int index, int k, int target){
        if(index < 0) return true;
        int num = nums[index];
        if(num > target) return false;
        for(int i = 0; i < k; i ++){
            if(sides[i] + num <= target){
                sides[i] += num;
                if(backtrack(nums, sides, index - 1, k, target)) return true;
            sides[i] -= num;
            }
            if(sides[i] == 0) break;
        }
        return false;
    }
}