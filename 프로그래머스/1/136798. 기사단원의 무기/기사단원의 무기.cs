using System;
using System.Collections.Generic;

public class Solution {
    public int solution(int number, int limit, int power) {
         int result = 0;
        for (int i = 1; i <= number; i++)
        {
            int cnt= 0;
            int n = 1;
            while (n <= Math.Sqrt(i))
            {
                if (i % n == 0) {
                    if (i != n * n) cnt += 2;
                    else cnt++;
                }
                n++;
            }
            result += cnt > limit ? power : cnt;
        }
        return result;
    }
}