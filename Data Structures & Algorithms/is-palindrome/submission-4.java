class Solution {
    public static boolean isPalindrome(String s) {
        int iL = 0;
        int iR = s.length()-1;
        while(iL < iR){
            while(iL < iR && !isAlphaNum(s.charAt(iL)))iL++;
            while(iL < iR && !isAlphaNum(s.charAt(iR)))iR--;
            if(Character.toLowerCase(s.charAt(iL)) != Character.toLowerCase(s.charAt(iR)))return false;
            iL++; iR--;
        }
        return true;
    }

    public static boolean isAlphaNum(char c){
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
