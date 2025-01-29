class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(myString);
        for(int i = 0; i<myString.length(); i++){
            if(myString.charAt(i)=='A')sb.setCharAt(i,'B');
            else sb.setCharAt(i,'A');
        }
        answer = sb.toString().contains(pat) ? 1:0;
        return answer;
    }
}