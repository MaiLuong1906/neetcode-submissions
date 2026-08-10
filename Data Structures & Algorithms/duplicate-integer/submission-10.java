class Solution {
    public static boolean hasDuplicate(int[] n) {
        boolean check = false;
        Set<Integer> set = new HashSet<>();
        for (int i : n) {
            if (set.contains(i)) {
                check = true;
                break;
            }
            set.add(i);
        }
        return check;
    }
}