import java.util.Arrays;
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        char[] a = my_string.toCharArray();
        char[] b = overwrite_string.toCharArray();
        
        System.arraycopy(b,0,a,s,b.length);
        
        for(char c : a){
            sb.append(c);
        }
        
        return sb.toString();
    }
}