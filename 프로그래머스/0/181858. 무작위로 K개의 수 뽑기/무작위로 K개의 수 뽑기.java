import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        
        //배열의 길이가 k길이를 넘어가지 않도로 배열추출
        int[] temp = Arrays.stream(arr).distinct().toArray();
        
        if(temp.length < k){
            answer = new int[k];
            System.arraycopy(temp,0,answer,0,temp.length);
            Arrays.fill(answer,temp.length,k,-1);
        }else{
            answer = Arrays.copyOf(temp,k);
        }
        
        return answer;
    }
}