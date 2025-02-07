import java.util.stream.IntStream;
class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        //idx보다 크면서 배열의 값이 1 인 가장 작은 인덱스를 찾아서 반환
        return IntStream.range(idx,arr.length).filter(i->arr[i]==1).findFirst().orElse(-1);
    }
}