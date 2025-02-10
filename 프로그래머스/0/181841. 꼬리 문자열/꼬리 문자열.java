class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(String s : str_list){
            if(!s.contains(ex)){
                sb.append(s);
            }
        }
        return sb.toString();
    }
}