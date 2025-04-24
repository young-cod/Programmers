import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        Map<Character,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                list.add(-1);
            }else{
                list.add(i-map.get(c));
            }
            map.put(c,i); 
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}