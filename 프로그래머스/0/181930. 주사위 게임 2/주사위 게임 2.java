class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int cnt = 1;
        if(a==b){
            if(b==c){
                cnt =3;
            }else cnt =2;
        }else if(a==c || b==c){
            cnt =2;
        }
        
        answer += a+b+c;
        if(cnt>1){
            answer *= (Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
            if(cnt>2){
              answer *= (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
            }
        }
     
        
        return answer;
    }
}