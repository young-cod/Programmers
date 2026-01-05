using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int[] solution(string[] keymap, string[] targets) {
      int[] answer = new int[targets.Length];

         Dictionary<char, int> minKeys = new Dictionary<char, int>();

         foreach (var key in keymap)
         {
             for (int i = 0; i < key.Length; i++)
             {
                 char c = key[i];
                 if (!minKeys.ContainsKey(key[i]) || i + 1 < minKeys[c])
                 {
                     minKeys[c] = i + 1;
                 }
             }
         }

         for (int i = 0; i < targets.Length; i++)
         {
             int total = 0;
             bool isPossible = true;
             foreach (var t in targets[i])
             {
                 if (minKeys.ContainsKey(t))
                 {
                     total += minKeys[t];
                 }
                 else
                 {
                     isPossible = false;
                     break;
                 }
             }
             answer[i] = isPossible ? total : -1;
         }

         return answer;
    }
}