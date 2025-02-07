import java.util.stream.IntStream;
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        
        return IntStream.range(end_num,start_num+1).map(x->start_num+end_num-x).toArray();
    }
}