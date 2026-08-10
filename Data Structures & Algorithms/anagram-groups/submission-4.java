class Solution {
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] c = s.toCharArray();
            int[] index = new int[26];
            for(char tmp: c){
                index[tmp - 'a']++;
            }
            String key = Arrays.toString(index);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

}
