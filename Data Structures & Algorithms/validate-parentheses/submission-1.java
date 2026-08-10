class Solution {
    public static boolean isValid(String s) {
        char[] c = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < c.length; i++){
            if(c[i] == '{' || c[i] == '[' || c[i] =='('){
                st.push(c[i]);
            }
            else{
                if(st.isEmpty())return false;
                if(c[i] == '}'){
                    if(st.pop() != '{') return false;
                }
                if(c[i] == ']'){
                    if(st.pop() != '[') return false;
                }
                if(c[i] == ')'){
                    if(st.pop() != '(') return false;
                }
            }
        }
        return st.isEmpty();
    }
}
