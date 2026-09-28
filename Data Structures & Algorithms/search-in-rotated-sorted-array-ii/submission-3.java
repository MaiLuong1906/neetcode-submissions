class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                left ++;
                right --;
                continue;
            }

            // Nửa bên trái đang được sắp xếp
            if (nums[left] <= nums[mid]) {

                // target nằm trong nửa bên trái
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } 
                // target nằm bên phải
                else {
                    left = mid + 1;
                }

            } 
            // Nửa bên phải đang được sắp xếp
            else {

                // target nằm trong nửa bên phải
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } 
                // target nằm bên trái
                else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}