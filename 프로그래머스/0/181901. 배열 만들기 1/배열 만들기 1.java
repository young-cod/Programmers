import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        

        return IntStream.range(1,n+1).filter(i->i%k==0).toArray();
    }
}