import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int first = IntStream.range(0,arr.length).filter(i->arr[i]==2).findFirst().orElse(-1);
        if(first == -1) return new int[]{-1};
        
        int last = IntStream.range(first,arr.length).filter(i->arr[i]==2).reduce((a,b)->b).orElse(-1);
        return Arrays.copyOfRange(arr,first,last+1);

    }
}