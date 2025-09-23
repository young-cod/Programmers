using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int[] solution(int k, int[] score) {
         int[] answer = new int[score.Length];
        List<int> list = new List<int>();

        list.Add(score[0]);
        answer[0] = score[0];
        for (int i = 1; i < score.Length; i++)
        {
            if (list.Count < k)
            {
                list.Add(score[i]);
                list.Sort();
            }
            else
            {
                list.Add(score[i]);
                list.Sort();
                list.RemoveAt(0);
            }

            answer[i] = list.Min();
        }


        return answer;
    }
}