import java.lang.Math;
import java.util.Arrays;
import java.util.stream.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = IntStream.range(0,num_list.length).filter(i->i%2==0).map(i->num_list[i]).sum();
        int b = IntStream.range(0,num_list.length).filter(i->i%2==1).map(i->num_list[i]).sum();
        return Math.max(a,b);
    }
}