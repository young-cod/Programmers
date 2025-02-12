import java.util.stream.IntStream;
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        return IntStream.range(0,included.length).filter(i->included[i]).map(i-> i*d+a).sum();
    }
}