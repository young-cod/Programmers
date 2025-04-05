import java.math.BigInteger;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int len = t.length() - p.length();
        BigInteger pNum = new BigInteger(p);
        for(int i = 0; i<=len; i++){
            if(t.charAt(i) <= p.charAt(0)){
                BigInteger subNum = new BigInteger(t.substring(i,i+p.length()));
                if(subNum.compareTo(pNum)<=0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}