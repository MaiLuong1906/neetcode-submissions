class Solution {
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> rs = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                rs.add(nums[i]);
            }
        }
        for (int i = 0; i < rs.size(); i++) {
            nums[i] = rs.get(i);
        }
        return rs.size();
    }
}