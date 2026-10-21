class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, path, res, used);
        return res;
    }
    public void backtrack(int[] nums, List<Integer> path, List<List<Integer>> res, boolean[] used){
        if(path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            if(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            path.add(nums[i]);
            used[i] = true;
            backtrack(nums, path, res, used);

            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}