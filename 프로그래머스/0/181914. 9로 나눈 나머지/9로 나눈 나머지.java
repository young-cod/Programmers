class Solution {
    public int solution(String number) {
        int answer = 0;
        
        return number.chars().map(Character::getNumericValue).sum()%9;
    }
}