
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, target, 0, 0, path, res);

        return res;
    }

    public void backtrack(int[] nums, int target, int start, int sum,
                          List<Integer> path, List<List<Integer>> res) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        if (sum > target) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            if (sum + nums[i] > target) {
                break;
            }

            path.add(nums[i]);

            backtrack(nums, target, i + 1, sum + nums[i], path, res);

            path.remove(path.size() - 1);
        }
    }
}
