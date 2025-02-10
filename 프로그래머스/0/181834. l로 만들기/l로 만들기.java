import java.util.stream.Collectors;
class Solution {
    public String solution(String myString) {
        String answer = "";
        return myString.chars().mapToObj(c -> c < 'l' ? 'l' : (char)c).map(String::valueOf).collect(Collectors.joining());
    }
}
