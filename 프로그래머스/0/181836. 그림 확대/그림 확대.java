class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        for(String p : picture){
            sb.setLength(0);
            for(char c : p.toCharArray()){
                for(int i = 0; i<k; i++){
                    sb.append(c);
                }
            }
            for(int i = 0; i<k; i++){
                answer[idx] = sb.toString();
                idx++;
            }
            
        }
        
        return answer;
    }
}