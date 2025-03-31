class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        boolean chk = true;
        for(char c : s.toCharArray()){
            if(chk)sb.append(Character.toUpperCase(c));
            else sb.append(Character.toLowerCase(c));

            chk = false;
            if(c==' '){
                chk = true;
            }      
        }
        
        return sb.toString();
    }
}