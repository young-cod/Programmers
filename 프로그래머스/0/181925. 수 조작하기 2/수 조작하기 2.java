class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        /*
        "w" : 수에 1을 더한다.
        "s" : 수에 1을 뺀다.
        "d" : 수에 10을 더한다.
        "a" : 수에 10을 뺀다.
        */
        for(int i = 0; i<numLog.length-1; i++){
            int num = numLog[i+1] - numLog[i];
            switch(num){
                case 1:
                    sb.append("w");
                    break;
                case -1:
                    sb.append("s");
                    break;
                case 10:
                    sb.append("d");
                    break;
                case -10:
                    sb.append("a");
                    break;
            }   
        }
        
        return sb.toString();
    }
}