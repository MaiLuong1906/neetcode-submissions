class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(s, 0, res, new ArrayList<>());
        return res;
    }

    public void backtrack(String s, int index, List<List<String>> res, List<String> path){
        if(index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i < s.length(); i ++){
            String st = s.substring(index, i + 1);
            if(isPalindromic(st)){
                path.add(st);
                backtrack(s, i + 1, res, path);
                path.remove(path.size() - 1);
            }
        }
    }

    public boolean isPalindromic(String s){
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
