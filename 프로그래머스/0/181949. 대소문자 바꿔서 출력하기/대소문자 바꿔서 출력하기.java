import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder sb = new StringBuilder();

        for(char c : a.toCharArray()){
            if(Character.isLowerCase(c)){
                char temp = Character.toUpperCase(c);
                sb.append(temp);
            }else{
                char temp = Character.toLowerCase(c);
                sb.append(temp);
            }
        }
        
        System.out.print(sb.toString());
    }
}