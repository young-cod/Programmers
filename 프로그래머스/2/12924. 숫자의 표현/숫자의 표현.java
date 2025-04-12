class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1 ; i <= n; i++){
            int total = 0;
            int num = i;
            while(true){
                total += num++;
                if(total == n){
                    answer++;
                    break;
                }else if(total > n){
                    break;
                }
            }   
        }
        
        
        return answer;
    }
}