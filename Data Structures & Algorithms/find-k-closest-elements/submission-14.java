class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int closet = 0, min = 20003;
        for(int i = 0; i < arr.length; i++){
            if(Math.abs(x - arr[i]) < min){
                min = Math.abs(x - arr[i]);
                closet = i;
            }
        }
        int l = closet, r = closet;
        boolean limL = true, limR = true;
        while(r - l + 1 < k){
            if(l == 0){
                r ++;
            }
            else if(r == arr.length - 1){
                l --;
            }
            else{
                if(Math.abs(arr[l - 1] - x) <= Math.abs(arr[r + 1] - x)){
                    l--;
                }
                else{
                    r++;
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = l; i <= r; i++){
            res.add(arr[i]);
        }
        return res;
    }
}