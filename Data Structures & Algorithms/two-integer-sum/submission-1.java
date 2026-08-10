class Solution {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> check = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            if(check.containsKey(diff)){
                return new int[]{check.get(diff),i};
            }
            check.put(num,i);
        }
        return new int[]{};
    }
}
