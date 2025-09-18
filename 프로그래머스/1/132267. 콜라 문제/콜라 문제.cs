using System;

public class Solution {
    public int solution(int a, int b, int n) {
       //a : 빈병을 주면, b : 콜라를 줌, n : 빈병 개수
        int answer = 0;
        int remain = 0;

        while (n > 0)
        {
            int coke = 0;
            if (n < a)
            {
                n += remain;
                coke = (n / a) * b;
                remain = 0;
            }
            //todo  fdskdurl
            else coke = (n / a) * b;

            answer += coke;
            remain += n % a;
            n = coke;
        }

        return answer;
    }
}