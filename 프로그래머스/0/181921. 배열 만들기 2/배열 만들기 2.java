import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = l; i<=r; i++){
            String num = String.valueOf(i);
            if(num.matches("[05]+")){
                list.add(i);
            }
        }
       
        if(list.size() == 0)return new int[]{-1};
        
        return list.stream().mapToInt(i->i).toArray();
    }
}