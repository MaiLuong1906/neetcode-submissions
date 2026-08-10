class Solution {
    public static boolean hasDuplicate(int[] n) {
        boolean check = false;
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    check = true;
                   
                }
            }
        }
        return check;
    }
}