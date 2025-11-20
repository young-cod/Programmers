using System;

public class Solution {
    public int solution(string s) {
        if(s.Length == 1) return 1;
        
        int answer = 0;
        int xCount = 1, otherCount=0;
        char x = s[0];
        for(int i = 1; i<s.Length; i++){
            if(s[i]==x)xCount++;
            else otherCount++;
            
            if(xCount==otherCount || i == s.Length-1){
                if(i+1 < s.Length)x=s[i+1];
                xCount = 0; otherCount=0;
                answer++;
            }
            
        }
        
        
        return answer;
    }
}