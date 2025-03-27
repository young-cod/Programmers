import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer,-1);
        
        for(int i = 0; i<queries.length; i++){
            int[] q = queries[i];
            for(int j = q[0]; j<=q[1]; j++){
                if(arr[j] > q[2]){
                    answer[i] = answer[i] == -1 ? arr[j] : Math.min(arr[j],answer[i]);
                }
            }
        }
        
        return answer;   
    }
}