class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0, l = 0;
        int[] count = new int[26];
        int maxFre = 0;
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'A'] ++;

            maxFre = Math.max(maxFre, count[s.charAt(i) - 'A']);

            while((i - l + 1) - maxFre > k){
                count[s.charAt(l) - 'A'] --;
                l++;
            }
            res = Math.max(res, i - l + 1);
        }
        return res;
    }
}
