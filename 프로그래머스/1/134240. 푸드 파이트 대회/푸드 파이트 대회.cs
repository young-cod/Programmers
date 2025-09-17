using System;
using System.Linq;

public class Solution {
    public string solution(int[] food) {
           string answer = "";
            string leftPlayer = string.Empty;
            string rightPlayer = string.Empty;

            for (int i = 1; i < food.Length; i++)
            {
                char foodNum = (char)(i + '0');
                leftPlayer += new string(foodNum, food[i] / 2);
            }
            answer += leftPlayer + "0" + new string(leftPlayer.Reverse().ToArray());

            return answer;
        }
}