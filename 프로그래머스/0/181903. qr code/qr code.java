import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public String solution(int q, int r, String code) {
        //1
        //         String answer = "";
        
//         return IntStream.range(0,code.length()).filter(i->i%q==r).mapToObj(i-> String.valueOf(code.charAt(i))).collect(Collectors.joining());
        //2
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<code.length(); i++){
            if(i%q==r){
                sb.append(code.charAt(i));
            }
        }
        return sb.toString();
    }
}