class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] m = binomial.split(" ");
        int a = Integer.parseInt(m[0]);
        int b= Integer.parseInt(m[2]);
        String op = m[1];
        
        switch(op){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            
        }
        return answer;
    }
}