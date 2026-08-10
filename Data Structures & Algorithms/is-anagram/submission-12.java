class Solution {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        boolean check = true;
        int[] n = new int[27];
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        for(int i = 0; i < a.length; i ++){
            n[(int) (a[i] - 'a')] ++;
            n[(int) (b[i] - 'a')] --;
        }
        for(int i = 0; i < 27; i++){
            if(n[i] != 0){
                check = false;
                break;
            }
        }
        return check;
    }
}
