public class Solution {
    static int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
    static string[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
    public string solution(int a, int b) {
        string answer = "";
        int calcDay = 0;
        for(int i = 0; i<a-1; i++){
            calcDay += month[i];
        }
        calcDay += b-1;
        
        
        return day[calcDay%7];
    }
}