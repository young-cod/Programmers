using System;

public class Solution {
    public string solution(string[] str_list, string ex) {
        string answer = "";

 foreach (var str in str_list)
 {
     if(!str.Contains(ex)){
         answer += str;
     }
 }

 return answer;
    }
}