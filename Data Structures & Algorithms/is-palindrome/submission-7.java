class Solution {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;
        while(left <= right){
            if(!isAlphanumerical(s.charAt(left))){
                left ++;
                continue;
            }
            if(!isAlphanumerical(s.charAt(right))){
                right --;
                continue;
            }
            else{
                char c = Character.toLowerCase(s.charAt(left));
                char k = Character.toLowerCase(s.charAt(right));
                if(Character.compare(c, k) == 0){
                    left ++;
                    right --;
                }
                else return false;
            }
        }
        return true;
    }
    public static boolean isAlphanumerical(char c){
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }
}
