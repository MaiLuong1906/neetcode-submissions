class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        char[] c = strs[0].toCharArray();
        for(int i = 0; i < c.length; i ++){
            String tmp = s + c[i];
            for(int j = 1; j < strs.length; j++){
                if(!strs[j].startsWith(tmp)) return s;
            }
            s = tmp;
        }
        return s;
    }
}