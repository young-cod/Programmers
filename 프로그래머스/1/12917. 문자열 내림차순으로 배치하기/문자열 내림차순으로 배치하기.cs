using System.Linq;
using System;

public class Solution {
    public string solution(string s) {
        string answer = "";
        char[] charArray = s.ToCharArray();
        Array.Sort(charArray);
        Array.Reverse(charArray);
        
        answer = new string(charArray);
        
        return answer;
    }
}