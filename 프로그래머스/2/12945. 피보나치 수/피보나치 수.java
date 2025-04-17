    class Solution {
    public int solution(int n) {
        if(n==1 || n==2) return 1;
        int a = 1, b = 1, c = 0;
        for(int i=3; i<=n; i++){
            c = (a+b)%1234567;
            a = b;
            b = c;
            
        }
        return c;
    }
}
   
        