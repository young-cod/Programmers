public class Solution {
    public string solution(string s, int n) {
        string answer = "";
        
       foreach (var item in s)
        {
            if(item == ' '){
                answer += item;
                continue;
            }
            int check = item + n;
            if (char.IsUpper(item))
            {
                if (check > 'Z')
                {
                    check -= 'Z';
                    check += 'A'-1;
                }
            }
            else
            {
                if (check > 'z')
                {
                    check -= 'z';
                    check += 'a'-1;
                }
            }
                answer += (char)check;
        }
        
        return answer;
    }
}