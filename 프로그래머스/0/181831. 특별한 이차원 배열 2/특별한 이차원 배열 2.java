class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        
        boolean flag = false;
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i!=j){
                   flag = arr[i][j] == arr[j][i] ? false : true;
                    if(flag)return 0;
                } 
            }
        
        }
        
        return flag ? 0 : 1;
    }
}