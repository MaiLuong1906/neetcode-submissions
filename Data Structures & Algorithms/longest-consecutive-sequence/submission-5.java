class Solution {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        System.out.println(set);
        int record = 1;
        int max = 1;
        while(set.size()!=0){
            if (set.contains(set.first()+1)){
                max ++;
                set.remove(set.first());
            }
            else{
                if(max > record){
                    record= max;
                }
                max = 1;
                set.remove(set.first());
            }
        }

        return record;
    }
}
