import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(s.isEmpty()){
                s.push(arr[i]);
            }else{
                if(s.peek() < arr[i]){
                    s.push(arr[i]);
                }else{
                    s.pop();
                    i--;
                }
            }
        }
        
        
        return s.stream().mapToInt(i->i).toArray();
    }
}