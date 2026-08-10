class Solution {
    public static int maxArea(int[] heights) {
        int res = 0;
        int l = 0;
        int r = heights.length - 1;
        while(l < r){
            int h = Math.min(heights[l], heights[r]);
            res = Math.max(res, h*(r-l));
            if(heights[l] < heights[r]) l++;
            else r--;
        }
        return res;
    }
}
