class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        //2 홀수 제곱의 합
        //1 홀수 합의 2배
        //0 홀수 abs minus
        boolean isA = a%2==1? true : false;
        boolean isB = b%2==1? true : false;
        
        if(isA && isB){
            return a*a + b*b;
        }else if(isA || isB){
            return (a+b) *2;
        }else{
           return Math.abs(a-b);
        }
        
    }
}