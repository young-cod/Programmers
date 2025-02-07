import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        /*
        return IntStream.concat(
            IntStream.range(n,num_list.length).map(i->num_list[i]),
            IntStream.range(0,n).map(i->num_list[i])
        ).toArray();
        */
        return IntStream.range(0,num_list.length).map(i->num_list[(i+n)%num_list.length]).toArray();
    }
}