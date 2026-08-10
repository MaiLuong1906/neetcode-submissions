class Solution {

    public static String encode(List<String> strs) {
        if(strs.size() == 0) return null;
        String rs = "";
        String salt = "jfajfjagfj#4019019";
        int index = 0;
        while(index < strs.size() -1){
            if (strs.get(index) ==""){
                rs += "lafja1;ala;ldf" + salt;
            }
            else{
                rs += strs.get(index) + salt;
            }
            index ++;
        }
        rs += strs.get(index);
        if (strs.get(index) ==""){
            rs += "lafja1;ala;ldf";
        }
        return rs;
    }

    public static List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        if (str == null){
            return list;
        }
        String[] res = str.split("jfajfjagfj#4019019");
        for(int i = 0; i < res.length; i++){
            if(res[i].contains("lafja1;ala;ldf")){
                list.add("");
            }
            else{
                list.add(res[i]);
            }
        }
        return list;
    }
}
