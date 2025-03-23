import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);
        
        return x.add(y).toString();
    }
}