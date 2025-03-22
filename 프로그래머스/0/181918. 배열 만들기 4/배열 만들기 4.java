import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(s.isEmpty()){
                s.push(arr[i]);
            }else{
                int temp = s.pop();
                if(temp < arr[i]){
                    s.push(temp);
                    s.push(arr[i]);
                }else i--;
            }
        }
        
        
        return s.stream().mapToInt(i->i).toArray();
    }
}