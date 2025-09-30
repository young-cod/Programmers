using System;
using System.Linq;

public class Solution {
    public int[] solution(int num, int total) {
       int[] answer = new int[] { };

            int start = (total - (num * (num + 1)) / 2) / num + 1;
            Console.Write(start);
            answer = Enumerable.Range(start, num).ToArray();

            return answer;
    }
    
}