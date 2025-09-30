using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public string[] solution(string[] players, string[] callings) {
        Dictionary<string, int> rankDic = new Dictionary<string, int>();
         Dictionary<int, string> nameDic = new Dictionary<int, string>();

         for (int i = 0; i < players.Length; i++)
         {
             rankDic.Add(players[i], i + 1);
             nameDic.Add(i + 1, players[i]);
         }

         foreach (string call in callings)
         {
             //현재 순위
             int currentRank = rankDic[call];
             //새 순위
             int newRank = currentRank - 1;
             //추월될 선수
             string frontP = nameDic[newRank];

             rankDic[call] = newRank;
             rankDic[frontP] = currentRank;

             nameDic[currentRank] = frontP;
             nameDic[newRank] = call;
         }
         return nameDic.Select(x => x.Value).ToArray();
    }
}