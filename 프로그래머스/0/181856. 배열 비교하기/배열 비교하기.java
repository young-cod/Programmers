import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        //1<2 : -1
        //1==2 1sum >2sum : 1
        //1==2 isum==2sum: 0
        if(arr1.length == arr2.length){
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            if(sum1 == sum2){
                answer = 0;
            } 
            else{
                answer = (sum1 > sum2) ? 1 : -1;
            }
        }
        else{
            answer = arr1.length > arr2.length ? 1:-1;
        }
        return answer;
    }
}