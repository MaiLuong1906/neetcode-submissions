class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int target = nums.length / 2;
        int index = 0;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == nums[target]){
                index ++;
            }
            if(index >= target) break;
        }
        return nums[target];
    }
}