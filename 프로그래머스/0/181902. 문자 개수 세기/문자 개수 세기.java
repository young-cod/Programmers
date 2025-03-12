class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        int idx = 0;
        for(int c : my_string.chars().toArray()){
            if(c>='a')idx = c - 'A' - 6;
            else idx = c - 'A';
            
            answer[idx]++;
        }
        return answer;
    }
}