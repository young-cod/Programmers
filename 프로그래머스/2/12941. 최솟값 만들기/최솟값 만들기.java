import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int len = A.length-1;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i<=len; i++){
            answer += A[i] * B[len-i];
        }
        
        return answer;
    }
}