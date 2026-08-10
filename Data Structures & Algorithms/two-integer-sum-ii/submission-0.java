class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int slow = 0;
        while(slow < n - 1){
            int fast = slow+1;
            int diff = target - numbers[slow];
            while( fast < n){
                if(numbers[fast] == diff){
                    return new int[]{slow+1, fast+1};
                }
                fast++;
            }
            slow++;
        }
        return new int[]{};
    }
}
