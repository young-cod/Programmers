import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
         int[] arr = IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .boxed()
                .sorted((a, b) -> Integer.compare(rank[a], rank[b]))
                .limit(3)
                .mapToInt(Integer::valueOf)
                .toArray();
        
        int[] num = new int[]{10000,100,1};
        for(int i = 0; i<3; i++){
            answer += arr[i] * num[i];
        }
        
        
        return answer;
    }
}