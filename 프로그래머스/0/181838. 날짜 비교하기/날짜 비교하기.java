import java.util.stream.IntStream;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        for(int i = 0; i<3; i++){
            if(date1[i] < date2[i])return 1;
            if(date1[i] > date2[i])return 0;
        }
        
        return 0;
    }
}