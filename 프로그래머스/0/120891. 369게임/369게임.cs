using System;

public class Solution {
    public int solution(int order) {
        int answer = 0;

            string str = order.ToString();
            foreach (var item in str)
            {
                if (item == '3' || item == '6' || item == '9')
                {
                    answer++;
                }
            }

            return answer;
    }
}