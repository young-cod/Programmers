import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        //bac onlettu c etom a to
        answer = myStr.split("[a-c]+");
        for(String a : answer){
            if(!a.isEmpty())list.add(a);
        }
        return list.isEmpty() ? new String[]{"EMPTY"} : list.toArray(new String[0]);
    }
}