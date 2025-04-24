import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)) map.put(c,i-map.get(c));
            answer[i] = map.getOrDefault(c,-1);
            map.put(c,i);
        }
        
        return answer;
    }
}