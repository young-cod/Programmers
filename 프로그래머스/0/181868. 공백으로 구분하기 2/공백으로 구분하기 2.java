import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        String[] temp = my_string.split(" +");
        for(String word : temp){
            if(!word.isEmpty()){
                answer.add(word);
            }
        }
        return answer.toArray(new String[0]);
    }
}