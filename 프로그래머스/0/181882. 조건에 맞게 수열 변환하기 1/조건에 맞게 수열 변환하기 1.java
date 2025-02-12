import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        //n >= 50 even || 2 div
        //n < 50 odd || 2 red
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=50 && arr[i]%2==0){
                answer[i] = arr[i] / 2;
            }else if(arr[i] < 50 && arr[i]%2==1){
                answer[i] = arr[i] * 2;
            }else answer[i] = arr[i];
        }
        
        return answer;
    }
}