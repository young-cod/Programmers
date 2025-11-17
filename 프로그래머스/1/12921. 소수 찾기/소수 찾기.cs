using System;

public class Solution {
    static public bool IsPrime(int number){
        if(number==2){
            return true;
        }
        
        if(number%2==0)return false;
        
        for(int i =3; i*i<=number; i+=2){
            if(number%i==0)return false;
        }
        
        return true;
    }
    
    public int solution(int n) {
        int answer = 0;
        
        for(int i =2; i<=n; i++){
            if(IsPrime(i)){
                answer++;
            }
        }
        
        return answer;
    }
}