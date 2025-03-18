import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        
        int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
            
        
        answer += min + " " + max;
        
        return answer;
    }
}