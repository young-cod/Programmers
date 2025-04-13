import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int len = Integer.bitCount(n);
        while(true){
            n++;
            if(Integer.bitCount(n) == len){
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}