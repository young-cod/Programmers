using System;

public class Solution {
    public string solution(string[] cards1, string[] cards2, string[] goal) {
         string answer = "Yes";
        int c1 = 0;
        int c2 = 0;

            for (int i = 0; i < goal.Length;)
            {
                if (c1 < cards1.Length && goal[i].Equals(cards1[c1]))
                {
                    c1++;
                }
                else if (c2 < cards2.Length && goal[i].Equals(cards2[c2])) c2++;
                else return "No";

                i++;
            }


        return answer;
    }
}