class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int check = 0;
        for(char c : s.toCharArray()){
            if(c=='('){
                check+=1;
            }else{
                check-=1;
            }
            
            if(check<0){
                answer=false;
                break;
            }
        }
        
        if(check != 0)answer=false;
        return answer;
    }
}