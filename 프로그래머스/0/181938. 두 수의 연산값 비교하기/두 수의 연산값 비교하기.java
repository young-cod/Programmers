class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str = ""+a+b;
        int ab = Integer.parseInt(str);
        
        return Math.max(ab,2*a*b);
    }
}