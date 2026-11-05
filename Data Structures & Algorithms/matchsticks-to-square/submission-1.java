class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for(int x: matchsticks){
            sum += x;
        }
        if(sum % 4 != 0) return false;
        int[] sides = new int[4];
        int target = sum / 4;
        Arrays.sort(matchsticks);
        if(matchsticks[0] > target) return false;
        reversed(matchsticks);
        return backtrack(sides, target, 0, matchsticks);
    }
    public boolean backtrack(int[] sides, int target, int index, int[] matchsticks){
        if(index == matchsticks.length) return true;

        for(int i = 0; i < 4; i ++){
            if(sides[i] + matchsticks[index] > target){
                continue;
            }
            if(i > 0 && sides[i] == sides[i - 1]) continue;

            sides[i] += matchsticks[index];
            if(backtrack(sides, target, index + 1, matchsticks)) return true;

            sides[i] -= matchsticks[index];
            if(matchsticks[index] == 0) break;
        }
        return false;
    }
    public void reversed(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left ++;
            right --;
        }
    }
}