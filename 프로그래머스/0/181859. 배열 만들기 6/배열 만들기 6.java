import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i<arr.length; i++){
            if(s.isEmpty()){
                s.push(arr[i]);
            }else{
                int temp = s.pop();
                if(temp != arr[i]){
                    s.push(temp);
                    s.push(arr[i]);
                }
            }
        }
        int[] answer = new int[s.size()];
        if(answer.length == 0)return new int[]{-1};

        for(int i=answer.length-1; i>=0; i--){
            answer[i] = s.pop();
        }
        
        return answer;
    }
}