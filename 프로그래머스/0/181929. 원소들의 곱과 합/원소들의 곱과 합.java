import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int multi = Arrays.stream(num_list).reduce(1,(x,y)->x*y);
        int sum = Arrays.stream(num_list).reduce(0,(x,y)->x+y);
        System.out.print(multi + " " + sum);
        return multi > sum*sum ? 0 : 1;
    }
}