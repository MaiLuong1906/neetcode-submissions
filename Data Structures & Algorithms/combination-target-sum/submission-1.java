class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(nums, target, 0, 0, path, res);
        return res;
    }
    public void backtrack(int[] nums, int target, int index, int sum, List<Integer> path, List<List<Integer>> res){
        if(sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        if(sum > target || index >= nums.length) return;

        path.add(nums[index]);
        backtrack(nums, target, index, sum + nums[index], path, res);

        path.remove(path.size() -1);

        backtrack(nums, target, index + 1, sum, path, res);
    }
}
