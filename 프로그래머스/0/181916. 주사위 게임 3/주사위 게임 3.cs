using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int solution(int a, int b, int c, int d) {
       int answer = 1;
        int[] abcd = new int[] { a, b, c, d };
        Dictionary<int, int> dic = new Dictionary<int, int>();
        for (int i = 0; i < abcd.Length; i++)
        {
            if (dic.ContainsKey(abcd[i]))
            {
                dic[abcd[i]]++;
            }
            else
            {
                dic.Add(abcd[i], 1);
            }
        }

        if (dic.Count == 1)
        {
            return 1111 * a;
        }

        if (dic.Count == 4)
        {
            return abcd.Min();
        }

        if (dic.Count == 3)
        {
            int q = dic.Where(x => x.Value != 2).ElementAt(0).Key;
            int r = dic.Where(x => x.Value != 2).ElementAt(1).Key;
            return q*r;
        }

        if (dic.Count == 2)
        {
            if (dic.Values.Contains(3))
            {
                int p = dic.FirstOrDefault(x => x.Value == 3).Key;
                int q = dic.FirstOrDefault(x => x.Value == 1).Key;

                return (int)MathF.Pow((10 * p + q), 2);
            }
            else
            {
                int p = dic.Keys.ElementAt(0);
                int q = dic.Keys.ElementAt(1);

                return (p + q) * (int)MathF.Abs(p - q);
            }
        }


        return answer;
    }
}