using System.Collections.Generic;
using System;

public class Solution {
    public long solution(long n) {
        long answer = 0;

         char[] number = n.ToString().ToCharArray();

         Array.Sort(number);
         Array.Reverse(number);

         string str = new string(number);

         answer = long.Parse(str);

         return answer;
    }
}