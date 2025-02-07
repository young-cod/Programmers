import java.util.stream.Collectors;
import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        return Arrays.stream(index_list).mapToObj(x->String.valueOf(my_string.charAt(x))).collect(Collectors.joining());
    }
}