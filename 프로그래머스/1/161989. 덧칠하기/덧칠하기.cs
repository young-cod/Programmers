using System;

public class Solution {
    public int solution(int n, int m, int[] section) {
        if(m==1)return section.Length;
        
        int answer = 1;
       
        int len = section.Length-1;
        int check = section[0] + m;
        for(int i = 1; i<section.Length; i++){
            if(check <= section[i]){
                check = section[i]+m;
                answer++;
            }else continue;
        }
        
        return answer;
    }
}