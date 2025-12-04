using System;
using System.Linq;
using System.Collections.Generic;

public class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Dictionary<int, int> dic = new Dictionary<int, int>();

        foreach (var item in tangerine)
        {
            if (!dic.ContainsKey(item))
            {
                dic.Add(item, 1);
            }
            else dic[item]++;
        }

         List<int> list = dic.Values.OrderByDescending(x => x).ToList();

         int sum = dic.Values.Sum();
         foreach(var item in list){
             k -= item;
             answer++;
             if(k<=0){
                break;
             }
         }
        
        return answer;
    }
}