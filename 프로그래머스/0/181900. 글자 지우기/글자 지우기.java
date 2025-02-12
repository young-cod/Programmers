import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(indices);
        int idx = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(idx<indices.length){
                if(indices[idx]==i){
                    idx++;
                    continue;
                }
            }
            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }
}