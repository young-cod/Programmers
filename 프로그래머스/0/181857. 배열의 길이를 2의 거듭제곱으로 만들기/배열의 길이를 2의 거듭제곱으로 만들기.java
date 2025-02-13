import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        int i = 1;
        while(i<arr.length){
            i <<= 1;
        }       
        
        return Arrays.copyOf(arr,i);
    }
}