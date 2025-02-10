class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.split(" ").length];
        StringBuilder sb = new StringBuilder();
        
        
        int idx = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i) != ' ')sb.append(my_string.charAt(i));
            if(my_string.charAt(i) == ' ' || i == my_string.length()-1){
                answer[idx++]=sb.toString();
                sb.setLength(0);
            }
        }
        
        return answer;
    }
}