class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat = 0;
        Arrays.sort(people);
        int left = 0, right = people.length -1;
        while(left <= right){
            if(left == right){
                boat ++;
                break;
            }
            if(people[left] + people[right] > limit){
                boat ++;
                right --;
            }
            else{
                boat ++;
                right --;
                left ++;
            }
        }
        return boat;
    }
}