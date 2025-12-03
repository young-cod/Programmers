using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int total = brown + yellow;
        for(int i = total; i>0; i--){
            if(total % i == 0){
                if(yellow % (i-2) == 0){
                    Console.WriteLine($"{i}:{total/i}");
                    answer[0] = i;
                    answer[1] = total/i;
                    break;
                }
            }
        }
        
        return answer;
    }
}