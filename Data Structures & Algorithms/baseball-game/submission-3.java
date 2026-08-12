class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                int x = list.get(list.size() - 1) + list.get(list.size() -2);
                list.add(x);
            }
            else if(operations[i].equals("D")){
                int x = list.get(list.size() -1) * 2;
                list.add(x);
            }
            else if(operations[i].equals("C")){
                list.remove(list.size() -1);
            }
            else list.add(Integer.parseInt(operations[i]));
        }
        int sum = 0;
        for(Integer x: list){
            sum += x;
        }
        return sum;
    }
}