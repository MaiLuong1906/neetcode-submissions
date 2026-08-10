class Solution {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        quickSort(s1, 0, s.length()-1);
        quickSort(s2, 0, s.length()-1);
        for(int i = 0; i < s.length(); i++){
            if(s1[i] != s2[i]) return false;
        }
        return true;
    }

    public static void quickSort(char[] s, int left, int right){
        if(left >= right)return;

        int mid = (left+right)/2;
        int pivot = partition(s, left, right, s[mid]);

        quickSort(s, left, pivot-1);
        quickSort(s, pivot, right);
    }

    public static int partition(char[] s, int left, int right, char key){
        int iL = left;
        int iR = right;
        while(iL <= iR){
            while(s[iL] < key) iL++;
            while(s[iR] > key) iR--;
            if(iL <= iR){
                char tmp = s[iL];
                s[iL] = s[iR];
                s[iR] = tmp;
                iL++; iR--;
            }
        }
        return iL;
    }
}
