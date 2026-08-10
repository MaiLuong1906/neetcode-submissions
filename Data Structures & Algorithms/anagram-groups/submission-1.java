class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> rs = new HashMap<>();
        for(String s: strs){
            int[] count = new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            String check = Arrays.toString(count);
            rs.putIfAbsent(check, new ArrayList<>());
            rs.get(check).add(s);
        }
        return new ArrayList<>(rs.values());
    }
}
