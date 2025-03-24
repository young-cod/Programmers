class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for(int[] q : queries){
            String substr = my_string.substring(q[0],q[1]+1);
            StringBuilder sb = new StringBuilder(substr);
            String reverseStr = sb.reverse().toString();
            
            String before = my_string.substring(0,q[0]); 
            String after = my_string.substring(q[1]+1,my_string.length());
            
            my_string = before + reverseStr + after;
        }
        
        return my_string;
    }
}