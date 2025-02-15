class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int[] q : queries){
            int a = q[0];
            int b = q[1];
        int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            }
        answer = arr;
        return answer;
    }
}