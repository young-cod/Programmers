import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        return IntStream.range(0,num_list.length).filter(i->i<n).map(i->num_list[i]).toArray();
    }
}