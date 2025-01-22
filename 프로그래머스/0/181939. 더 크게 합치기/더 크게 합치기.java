class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        
        int intA = Integer.parseInt(strA + strB);
        int intB = Integer.parseInt(strB + strA);
        
        if(a==b)return intA;
        return intA > intB ? intA : intB;
    }
}