import java.util.stream.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] temp = arr.clone();
        boolean flag = true;   
        while(flag){
            flag = false;
            for(int i=0; i<temp.length; i++){
                if(temp[i]>=50 && temp[i]%2==0){
                    temp[i]/=2;
                    flag = true;
                }else if(temp[i] < 50 && temp[i]%2==1){
                    temp[i] = temp[i] * 2 + 1;
                    flag = true;
                }
            }
            answer++;
        }
        return answer-1;
    }
}