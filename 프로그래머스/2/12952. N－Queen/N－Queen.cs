using System;

public class Solution {
    static int[] queen;
    
    static bool CheckLogic(int x, int y){
        for(int i = 0; i<y; i++){
            //열 확인
            if(queen[i]==x){
                return false;
            }
            
            //대각선 확인
            if(Math.Abs(queen[i]-x) == Math.Abs(i-y)){
                return false;
            }
            
        }
        return true;
    }
    
    static void bt(int num, int depth, ref int answer){
        if(num == depth){
            answer++;
            return;
        }
        
        for(int i = 0; i<depth; i++){
            if(CheckLogic(i,num))
            {
                queen[num]=i;
                bt(num+1,depth,ref answer);
                continue;
            }
        }
    }
    
    public int solution(int n) {
        int answer = 0;
        queen = new int[n];
        
        bt(0,n,ref answer);
        
        return answer;
    }
}