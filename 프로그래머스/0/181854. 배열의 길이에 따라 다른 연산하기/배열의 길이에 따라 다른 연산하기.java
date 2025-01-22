import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        
        int len = arr.length % 2 == 0? 1: 0;
        
        for(int i = 0; i<arr.length; i++){
            if(len == 1){
                if(i%2==1){
                    arr[i] += n;
                }
            }
            else{
                if(i%2==0)arr[i]+=n;
            }
        }
        
        answer = arr;
        
        return answer;
    }
}