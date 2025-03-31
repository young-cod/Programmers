import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        if(row==col)return arr;
        
        int max = Math.max(row,col);
        
        int[][] answer = new int[max][max];
        
        for(int i = 0; i<arr.length; i++){
            System.arraycopy(arr[i],0,answer[i],0,arr[0].length);
        }
        return answer;
    }
}