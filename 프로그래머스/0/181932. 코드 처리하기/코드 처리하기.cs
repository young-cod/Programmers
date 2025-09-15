using System;

public class Solution {
    public string solution(string code) {
          int mode = 0;
  string answer = string.Empty;

  for (int i = 0; i < code.Length; i++)
  {
      if (mode == 0)
      {
          if (code[i] != '1')
          {
              if (i % 2 == 0) answer += code[i];
          }
          else if (code[i] == '1')
          {
              mode = 1;
          }
      }
      else
      {
          if (code[i] != '1')
          {
              if (i % 2 == 1) answer += code[i];
          }
          else if (code[i] == '1')
          {
              mode = 0;
          }
      }
  }
  return answer == string.Empty ? "EMPTY" : answer;
    }
}