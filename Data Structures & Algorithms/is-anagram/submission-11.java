class Solution {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length())return false;
        boolean check = true;
        char[] a = s.toCharArray();
        Arrays.sort(a);
        char[] b = t.toCharArray();
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                check = false;
                break;
            }
        }
        return check;
    }
}
