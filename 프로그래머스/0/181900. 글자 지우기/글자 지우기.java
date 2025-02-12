import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int i : indices){
            arr[i] = "";
        }
        return String.join("",arr);
    }
}