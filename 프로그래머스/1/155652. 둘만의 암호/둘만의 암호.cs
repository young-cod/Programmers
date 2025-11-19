using System;

public class Solution {
    public string solution(string s, string skip, int index) {
        string answer = "";
        char a = 'a';
        char z = 'z';
        int idx = index;
        for(int i =0; i<s.Length; i++){
            int character = s[i];
            idx = index;
            while(idx>0){
                character++;
                if(character > z){
                    character =(character- z) + (a-1);
                }
                if(!skip.Contains((char)character)){
                    idx--;
                }
            }
            answer += (char)character;
        }
        
        
        return answer;
        }
        
    }
