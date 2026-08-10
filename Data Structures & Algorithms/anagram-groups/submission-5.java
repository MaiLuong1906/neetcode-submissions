class Solution {
    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i ++){
            char[] tmp = strs[i].toCharArray();
            Arrays.sort(tmp);
            String s = String.copyValueOf(tmp);
            if(map.containsKey(s)){
                map.get(s).add(strs[i]);
            }
            else{
                map.put(s, new ArrayList<>());
                map.get(s).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}
