using System;
using System.Linq;

class Solution
{
    public int solution(int n)
    {
        int answer = 0;

        //방법 1
        //string binaryNum = Convert.ToString(n,2);
        //int count = binaryNum.Where(x=>x=='1').Count();
        //answer= count;
        
        //방법 2
        while(n>0){
            if(n%2==0){
                n/=2;
            }else{
                n-=1;
                answer++;
            }
        }
        
        return answer;
    }
}