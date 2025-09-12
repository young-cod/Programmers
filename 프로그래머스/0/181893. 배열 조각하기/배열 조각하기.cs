using System;
using System.Linq;

public class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
        
        for(int i=0; i<query.Length; i++){
            if(i%2==0)
            {
                answer = answer.Take(query[i]+1).ToArray();
            }
            else{
                answer = answer.Skip(query[i]).ToArray();
            }
        }
        
        return answer;
    }
}