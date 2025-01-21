class Solution {
    public int solution(String num_str) {
        int answer = 0;
        return num_str.chars().filter(Character::isDigit)
            .map(Character::getNumericValue)
            .sum();
    }
}