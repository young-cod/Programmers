using System;
using System.Collections.Generic;
public class Solution {
     const int MAX_X = 5;
const int MAX_Y = 5;
const int len = 0;
public int solution(string dirs)
{
    Dictionary<string, bool> checkDic = new Dictionary<string, bool>();
    int x = 0, y = 0;

    foreach (var d in dirs)
    {
        int preX = x;
        int preY = y;

        int nextX = x;
        int nextY = y;

        switch (d)
        {
            case 'U': nextY++; break; 
            case 'D': nextY--; break;
            case 'L': nextX--; break;
            case 'R': nextX++; break;
        }

        if (Math.Abs(nextX) > MAX_X || Math.Abs(nextY) > MAX_Y)
        {
            continue;
        }

        x = nextX;
        y = nextY;

        string key;
        if (preX < x || (preX == x && preY < y))
        {
            key = $"{preX},{preY},{x},{y}";
        }
        else
        {
            key = $"{x},{y},{preX},{preY}";
        }

        if (!checkDic.ContainsKey(key)) checkDic.Add(key, true);
    }

    return checkDic.Count;
}
}