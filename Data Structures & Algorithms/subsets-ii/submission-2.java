class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backtrack(nums, 0, list, res);

        return res;
    }
        public void backtrack(int[] nums, int index,
                          List<Integer> path,
                          List<List<Integer>> res) {
        res.add(new ArrayList<>(path));
        Arrays.sort(nums);

        for (int i = index; i < nums.length; i++) {
            if(i > index && nums[i] == nums[i - 1]) continue;
            path.add(nums[i]);

            backtrack(nums, i + 1, path, res);

            path.remove(path.size() - 1);
        }
    }
}
