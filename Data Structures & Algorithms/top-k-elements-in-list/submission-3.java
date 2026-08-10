class Solution {
    public static int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort((o1, o2) -> o2 - o1);
        int[] rs = new int[k];
        int index = 0;
        while (index < k){
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue() == list.get(index)){
                    if(index == k)break;
                    rs[index] = entry.getKey();
                    index++;
                }
            }

        }
        return rs;
    }
}
