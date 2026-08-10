class Solution {
    public static boolean hasDuplicate(int[] n){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n.length; i++){
            if(!set.contains(n[i])){
                set.add(n[i]);
            }
            else {
                return true;
            }
        }
        return false;
    }
}