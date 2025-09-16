using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int[] solution(int[] numbers)
    {
        int size = (numbers.Length * numbers.Length - 1) / 2;
        int[] answer = new int[size];
        List<int> list = new List<int>();

        for (int i = 0; i < numbers.Length-1; i++) {
            for(int j = i+1; j<numbers.Length; j++){
                list.Add(numbers[i] + numbers[j]);
            }
        }
        list.Sort();
        answer = list.Distinct().ToArray();

        return answer;
    }
}