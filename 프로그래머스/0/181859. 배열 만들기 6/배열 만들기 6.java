import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.Stream;

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
        
        if(s.isEmpty())return new int[]{-1};
        
        return s.stream().mapToInt(i->i).toArray();
    }
}