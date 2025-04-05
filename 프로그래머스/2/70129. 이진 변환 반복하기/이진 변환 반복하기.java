
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int len = s.length();
        int removeZero = 0;
        
        int idx = 0;
        while(!s.equals("1")){
            int currentLen = s.replace("0","").length();
            int removeLen = len - currentLen;
            removeZero += removeLen;
            
            s = Integer.toBinaryString(currentLen);
            len = s.length();
            idx++;
        }
        
        answer[0] = idx;
        answer[1] = removeZero;
        
        return answer;
    }
}