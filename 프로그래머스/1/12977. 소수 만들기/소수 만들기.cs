using System;
using System.Linq;

class Solution
{
    static public bool IsPrime(int number){
        if(number <= 1){
            return false;
        }
        
        if(number == 2){
            return true;
        }
        
        if(number % 2 == 0){
            return false;
        }
        
        for(int i = 3; i*i<=number; i+=2){
            if(number%i ==0){
                return false;
            }
        }

        return true;
    }
    
    public int solution(int[] nums)
    {
        int answer= 0;
        
       for(int i = 0; i<nums.Length - 2; i++){
           for(int j =i+1; j<nums.Length -1; j++){
               for(int k = j+1; k<nums.Length; k++){
                   int number = nums[i] + nums[j] + nums[k];
                   if(IsPrime(number)){
                        answer++;
                   }
               }
           }
       }
        
        
        return answer;
    }
}