class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.isEmpty()) return new ArrayList<>();
        String[] mapping = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        backtrack(digits, 0, new StringBuilder(), res, mapping);
        return res;
    }
    public void backtrack(String digits,int index, StringBuilder path, List<String> res, String[] mapping){
        if(index == digits.length()){
            res.add(path.toString());
            return;
        }
        String letter = mapping[digits.charAt(index) - '0'];
        for(int i = 0; i < letter.length(); i++){
            path.append(letter.charAt(i));
            backtrack(digits, index + 1, path, res, mapping);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
