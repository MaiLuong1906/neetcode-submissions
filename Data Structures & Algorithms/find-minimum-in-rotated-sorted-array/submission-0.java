class Solution {
    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1, mid;
        while(l < r){
            mid = (l+r)/2;
            if(nums[mid] < nums[r]){
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return nums[l];
    }
}
