import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String[] arr = myString.split("x");
        return Arrays.stream(arr).filter(x->!x.isEmpty()).sorted().toArray(String[]::new);
    }
}