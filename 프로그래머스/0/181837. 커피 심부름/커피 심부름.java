class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        /*
        "iceamericano", "americanoice"	차가운 아메리카노
"hotamericano", "americanohot"	따뜻한 아메리카노
"icecafelatte", "cafelatteice"	차가운 카페 라테
"hotcafelatte", "cafelattehot"	따뜻한 카페 라테
"americano"	아메리카노
"cafelatte"	카페 라테
"anything"	아무거나

        */
        
        for(String o : order){
           if(o.contains("americano") || o.contains("anything")){
                answer+=4500;
           }
            else answer += 5000;
        }
        
        
        return answer;
    }
}