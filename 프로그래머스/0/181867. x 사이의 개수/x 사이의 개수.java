
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] div = myString.split("x");
        List<Integer> list = Arrays.stream(div).map(String::length).collect(Collectors.toList());
        
        if(myString.endsWith("x"))
            list.add(0);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}