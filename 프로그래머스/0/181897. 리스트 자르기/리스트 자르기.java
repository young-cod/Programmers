import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        //1 : 0~b
        //2 : a~
        //3 : a~b
        //4 : a~b / c
        
        switch(n){
            case 1:
                answer = Arrays.copyOfRange(num_list,0,slicer[1]+1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list,slicer[0],num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list,slicer[0],slicer[1]+1); 
                break;
            case 4:
                int[] arr = Arrays.copyOfRange(num_list,slicer[0],slicer[1]+1);
                answer = IntStream.range(0,arr.length).filter(i->i%slicer[2]==0).map(i->arr[i]).toArray();
                break;
        }
        
        return answer;
    }
}