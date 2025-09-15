using System;

public class Solution {
    public string solution(string code) {
           bool mode = false;
         string answer = string.Empty;

         for (int i = 0; i < code.Length; i++)
         {
             if (code[i] == '1')
             {
                 mode = !mode;
                 continue;
             }

             if (mode && i % 2 == 1) answer += code[i];
             else if(!mode && i%2==0)answer += code[i];
         }
         return answer == string.Empty ? "EMPTY": answer;
    }
}