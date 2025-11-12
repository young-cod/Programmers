using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<int> list = score.ToList();
        list.Sort();
        list.Reverse();

        List<int> check = new List<int>();
        for (int i = 0; i < list.Count; i++)
        {
            if (check.Count < m)
            {
                check.Add(list[i]);
            }

            if (check.Count == m)
            {
                answer += check.Min() * m;
                check.Clear();
            }
        }

        return answer;
    }
}