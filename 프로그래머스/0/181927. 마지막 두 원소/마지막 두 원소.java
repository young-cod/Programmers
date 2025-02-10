class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        for(int i = 0; i<answer.length-1; i++){
            answer[i] = num_list[i];
        }
        
        int len = num_list.length;
        int f = answer[len-2];
        int b = answer[len-1];
        
        answer[len] = b > f ? b-f : b*2;
        
        return answer;
    }
}