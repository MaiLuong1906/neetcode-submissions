class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] isUsed = new boolean[nums.length];
        backtrack(nums, path, res, isUsed);
        return res;
    }
    public void backtrack(int[] nums, List<Integer> path, List<List<Integer>> res, boolean[] isUsed){
        if(path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        if(path.size() > nums.length) return;

        for(int i = 0; i < nums.length; i++){
            if(isUsed[i]) continue;

            path.add(nums[i]);
            isUsed[i] = true;
            backtrack(nums, path, res, isUsed);

            path.remove(path.size() -1);
            isUsed[i] = false; 
        }
    }
}
