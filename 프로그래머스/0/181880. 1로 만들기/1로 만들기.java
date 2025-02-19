import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        answer = Arrays.stream(num_list).map(this::calcCount).sum();
        return answer;
    }
    
    //짝수라면 반으로 나누고
    //홀수라면 1을 뺀 뒤 반으로 나누면
     public int calcCount(int num) {
        int count = 0;
        
        while (num != 1) {
            if (num % 2 == 1) {
                num = (num - 1) / 2;
            } else {
                num /= 2;
            }
            count+=1;
        }
        
        return count;
    }
}