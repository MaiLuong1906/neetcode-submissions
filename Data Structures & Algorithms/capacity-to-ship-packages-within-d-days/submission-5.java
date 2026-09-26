class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0, sum = 0;
        for(int i = 0; i < weights.length; i++){
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }
        int left = max, right = sum;
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(check(mid, weights, days)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean check(int capacity, int[] weights, int days) {
        int count = 1, sum = 0;
        for(int x: weights){
            if(sum + x > capacity){
                count ++;
                sum = 0;
            }
            sum += x;
        }
        return count <= days;
    }
}