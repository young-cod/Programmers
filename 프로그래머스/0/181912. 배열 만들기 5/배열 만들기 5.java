import java.util.Arrays;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        
     return   Arrays.stream(intStrs).map(x->x.substring(s,s+l)).mapToInt(Integer::parseInt).filter(x->x>k).toArray();
        
    }
}