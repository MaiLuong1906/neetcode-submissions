class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = 1;
        while(true){
            if(i == numbers.length - 1){
                return null;
            }
            if(numbers[i] + numbers[j] == target){
                return new int[]{i + 1, j + 1};
            }
            if(j == numbers.length - 1){
                i++;
                j = 0;
            }
            j ++;
        }
    }
}
