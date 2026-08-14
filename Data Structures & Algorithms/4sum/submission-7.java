class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i ++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k ++){
                    long sum = (long)nums[i] + nums[j] + nums[k];
                    for(int l = k + 1; l < n; l++){
                        if(nums[l] == target - sum){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            if(isSameList(res, temp)){
                                res.add(temp);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
    public static boolean isSameList(List<List<Integer>> res, List<Integer> list){
        Collections.sort(list);
        for(List<Integer> temp: res){
            Collections.sort(temp);
            if(temp.equals(list)) return false;
        }
        return true;
    }
}