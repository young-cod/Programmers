import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        while(n!=1){
            list.add(n);
            n = n%2==0 ? n/2 : n*3+1;
        }
        list.add(1);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
