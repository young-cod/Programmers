import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(String s : strArr){
            int len = s.length();
            map.put(len,map.getOrDefault(len,0) + 1);
        }
        
        int max = 0;
        for(int cnt : map.values()){
            if(max < cnt)max = cnt;
        }
        
        return max;
    }
}