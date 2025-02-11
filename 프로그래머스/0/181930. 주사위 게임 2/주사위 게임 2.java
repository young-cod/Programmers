class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        
        int cnt = 1;
        if(a==b){
            if(b==c){
                cnt =3;
            }else cnt =2;
        }else if(a==c || b==c){
            cnt =2;
        }
        for(int i=1; i<=cnt; i++){
            answer *= (Math.pow(a,i) + Math.pow(b,i) + Math.pow(c,i));
        }
     
        
        return answer;
    }
}