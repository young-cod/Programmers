import java.util.stream.Collectors;
import java.util.Arrays;
class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        return Arrays.stream(str_list).filter(x->!x.contains(ex)).collect(Collectors.joining());
    }
}