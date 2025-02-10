import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        //k 홀수 곱하기
        //k 짝수 더하기
        
        return Arrays.stream(arr).map(x->k%2==1? x*k: x+k).toArray();
    }
}