class Solution {
    public static int[] sortArray(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    swap(nums, i, j);
                }
            }
        }
        return nums;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp; 
    }
}