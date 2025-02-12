import java.util.Arrays;
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int[] interval : intervals){
             int[] temp = Arrays.copyOfRange(arr,interval[0],interval[1]+1);
            for(int t : temp){
                list.add(t);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}