class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> tmp = new ArrayList<>(List.of(strs));
        int i = 0;
        int max = tmp.size();
        while (i < max){
            List<String> items = new ArrayList<>();
            items.add(tmp.get(i));
            for(int j = i + 1; j < max; j++){
                if(sortString(tmp.get(i)).equals(sortString(tmp.get(j)))){
                    items.add(tmp.get(j));
                    tmp.remove(j);
                    max--;
                    j--;
                }
            }
            i++;
            result.add(items);
        }
        return result;
    }

    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
