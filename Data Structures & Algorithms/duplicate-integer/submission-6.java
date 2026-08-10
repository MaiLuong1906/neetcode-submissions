class Solution {
    public static boolean hasDuplicate(int[] nums){
        int n = nums.length;
        sort(nums, 0, n-1);
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
    }

    public static void sort(int[] a, int left, int right){
        if(left >= right) return;

        int mid = (left + right) /2;

        int pivot = partition(a, left, right, a[mid]);

        sort(a, left, pivot -1);
        sort(a, pivot, right);
    }

    public static int partition(int[] a, int left, int right, int key){
        int iL = left;
        int iR = right;

        while(iL <= iR){
            while(a[iL] < key) iL++;
            while(a[iR] > key) iR--;
            if(iL <= iR){
                int tmp = a[iL];
                a[iL] = a[iR];
                a[iR] = tmp;
                iL++; iR--;
            }
        }
        return iL;
    }
}