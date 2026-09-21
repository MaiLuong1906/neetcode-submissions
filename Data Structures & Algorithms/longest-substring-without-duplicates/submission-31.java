class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0, l = 0, r = 0;
        Set<Character> set = new HashSet<>();

        while (r < s.length()) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(r));

            res = Math.max(res, r - l + 1);

            r++;
        }

        return res;
    }
}