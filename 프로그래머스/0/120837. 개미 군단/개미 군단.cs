using System;

public class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = 5;
        int soldier = 3;
        int worker = 1;
        
        answer = (hp/general) + (hp%general)/soldier + (hp%general)%soldier / worker;
        
        
        return answer;
    }
}